package rest.network.mappers;

import org.mapstruct.Mapper;
import rest.network.dto.PostTypeDto;
import rest.network.entity.PostTypeEntity;
import rest.network.mappers.abstr.EntityMapper;

@Mapper(componentModel = "spring")
public interface PostTypeEntityMapper extends EntityMapper<PostTypeEntity, PostTypeDto> {
}
