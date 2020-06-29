package rest.network.service.abstr;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.validation.annotation.Validated;
import rest.network.aspects.performance.PerformanceLog;
import rest.network.exceptions.LogicException;
import rest.network.exceptions.crud.CrudException;
import rest.network.exceptions.crud.EntityNotFoundException;
import rest.network.mappers.abstr.EntityMapper;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Validated
public abstract class AbstractCrudService
        <Entity, DTO, EntityId extends Long, Repository extends JpaRepository<Entity, EntityId>>
        implements CrudService<Entity, DTO, EntityId> {

    protected final Repository repository;
    protected final EntityMapper<Entity, DTO> mapper;

    protected final static Function<Long, Supplier<CrudException>> ENTITY_NOT_FOUND_EXCEPTION =
            id -> () -> new EntityNotFoundException(id);
    protected final static Supplier<LogicException> UNEXPECTED_ERROR = LogicException::new;

    @Override
    @PerformanceLog
    public DTO getById(EntityId id) {
        return repository.findById(id)
                .map(mapper::toDto)
                .orElseThrow(ENTITY_NOT_FOUND_EXCEPTION.apply(id));
    }

    @Override
    @PerformanceLog
    public List<DTO> getAllByIds(List<EntityId> entityIds) {
        return repository.findAllById(entityIds)
                .stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    @PerformanceLog
    public void deleteById(EntityId id) {
        repository.deleteById(id);
    }

    @Override
    @PerformanceLog
    public void deleteByIds(List<EntityId> entityIds) {
        entityIds.forEach(repository::deleteById);
    }

    @Override
    @PerformanceLog
    public Entity save(@Valid DTO dto) {
        return Optional.ofNullable(dto)
                .map(mapper::fromDto)
                .map(repository::save)
                .orElseThrow(UNEXPECTED_ERROR);
    }
}
