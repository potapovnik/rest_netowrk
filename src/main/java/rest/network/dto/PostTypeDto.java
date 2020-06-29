package rest.network.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class PostTypeDto {
    private Long id;

    @NotNull
    @NotBlank
    private String name;
}
