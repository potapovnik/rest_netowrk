package rest.network.service.post;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import rest.network.dto.PostTypeDto;
import rest.network.entity.PostTypeEntity;
import rest.network.exceptions.LogicException;
import rest.network.mappers.PostTypeEntityMapper;
import rest.network.repository.PostTypeRepository;
import rest.network.service.abstr.AbstractCrudService;

import java.util.Optional;

@Service
@Slf4j
public class PostTypeService extends AbstractCrudService<PostTypeEntity, PostTypeDto, Long, PostTypeRepository> {

    public PostTypeService(PostTypeRepository repository, PostTypeEntityMapper mapper) {
        super(repository, mapper);
    }

    // здесь необязательно пробрасывать исключение, просто для примера
    public PostTypeDto getByName(String name) {
        log.info("get post type by name {}", name);
        return Optional.ofNullable(name)
                .map(repository::getByName)
                .map(mapper::toDto)
                .orElseThrow(LogicException::new);
    }
}
