package rest.network.service.abstr;

import javax.validation.Valid;
import java.util.List;

public interface CrudService<Entity, DTO, EntityId extends Long> {

    DTO getById(EntityId id);

    List<DTO> getAllByIds(List<EntityId> ids);

    void deleteById(EntityId id);

    void deleteByIds(List<EntityId> ids);

    Entity save(@Valid DTO dto);
}
