package rest.network.dto;

import lombok.Data;

@Data
public class UserDto {
    private Long id;
    private String name;
    private String surname;
    private String lastName;
    private String login;
    private String password;
    private String email;
    private String phoneNumber;
}
