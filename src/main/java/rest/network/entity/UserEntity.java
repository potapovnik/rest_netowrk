package rest.network.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "dim_users", schema = "public", catalog = "rest_network")
@Data
public class UserEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "users_seq")
    @SequenceGenerator(name = "users_seq", sequenceName = "dim_users_id_seq", allocationSize = 1)
    private Long id;
    private String name;
    private String surname;
    private String lastName;
    private String login;
    private String password;
    private String email;
    private String phoneNumber;

    @OneToMany(mappedBy = "creator", fetch = FetchType.LAZY)
    private List<PostEntity> myPosts;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "participants")
    private List<PostEntity> allPosts;
}
