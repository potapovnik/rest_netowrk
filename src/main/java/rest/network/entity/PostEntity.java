package rest.network.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "post", schema = "public", catalog = "rest_network")
@Data
public class PostEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "post_seq")
    @SequenceGenerator(name = "post_seq", sequenceName = "post_id_seq", allocationSize = 1)
    private Long id;
    private String title;
    private String description;
    private Double lat;
    private Double lot;

    @Column(name = "created_date")
    private Timestamp createdDate;


    @Column(name = "start_date")
    private Timestamp startDate;


    @Column(name = "finish_date")
    private Timestamp finishDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "creator_id")
    private UserEntity creator;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "post_users",
            joinColumns = @JoinColumn(name = "post_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id"))
    private List<UserEntity> participants;
}
