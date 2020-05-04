package rest.network.dto;

import lombok.Data;
import rest.network.entity.UserEntity;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Data
public class PostDto {
    private Long id;
    private String title;
    private String description;
    private Double lat;
    private Double lot;
    private Date createdDate;
    private Date startDate;
    private Date finishDate;
    private UserDto creator;
    private List<UserDto> participants;
}
