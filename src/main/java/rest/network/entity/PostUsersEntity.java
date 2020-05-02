package rest.network.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "post_users", schema = "public", catalog = "rest_network")
@Data
public class PostUsersEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "post_users_seq")
    @SequenceGenerator(name = "post_users_seq", sequenceName = "post_users_id_seq", allocationSize = 1)
    private Long id;

    @Column(name = "post_id")
    private Integer postId;

    @Column(name = "user_id")
    private Integer userId;
}
