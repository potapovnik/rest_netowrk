package rest.network.mappers;

import org.mapstruct.Mapper;
import rest.network.dto.PostDto;
import rest.network.entity.PostEntity;
import rest.network.mappers.abstr.EntityMapper;

@Mapper(componentModel = "spring", uses = {UserMapper.class})
public interface PostEntityMapper extends EntityMapper<PostEntity, PostDto> {
}
