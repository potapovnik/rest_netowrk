package rest.network.mappers.abstr;

import java.util.List;

public interface EntityMapper<Entity, DTO> {

    Entity fromDto(DTO dto);

    DTO toDto(Entity entity);

    List<Entity> fromDto(List<DTO> dtoList);

    List<DTO> toDto(List<Entity> entityList);
}
