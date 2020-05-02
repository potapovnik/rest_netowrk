package rest.network.mappers;

import org.mapstruct.Mapper;
import rest.network.dto.UserDto;
import rest.network.entity.UserEntity;

import java.util.List;

@Mapper(componentModel = "spring", uses = {PostMapper.class})
public interface UserMapper {

    UserEntity fromDto(UserDto userDto);

    UserDto toDto(UserEntity usersEntity);

    List<UserEntity> fromDto(List<UserDto> userDtos);

    List<UserDto> toDto(List<UserEntity> usersEntities);
}
