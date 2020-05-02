package rest.network.mappers;

import org.mapstruct.Mapper;
import rest.network.dto.PostDto;
import rest.network.dto.UserDto;
import rest.network.entity.PostEntity;
import rest.network.entity.UserEntity;

import java.util.List;


@Mapper(componentModel = "spring", uses = {UserMapper.class})
public interface PostMapper {

    PostEntity fromDto(PostDto postDto);

    PostDto toDto(PostEntity postEntity);

    List<PostEntity> fromDto(List<PostDto> postDtos);

    List<PostDto> toDto(List<PostEntity> postEntities);
}
