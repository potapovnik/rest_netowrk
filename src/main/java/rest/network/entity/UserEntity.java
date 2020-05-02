package rest.network.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "users", schema = "public", catalog = "rest_network")
@Data
public class UserEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "users_seq")
    @SequenceGenerator(name = "users_seq", sequenceName = "users_id_seq", allocationSize = 1)
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
