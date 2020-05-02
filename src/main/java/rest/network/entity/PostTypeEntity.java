package rest.network.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "dim_post_type", schema = "public", catalog = "rest_network")
@Data
public class PostTypeEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "post_type_seq")
    @SequenceGenerator(name = "post_type_seq", sequenceName = "post_type_id_seq", allocationSize = 1)
    private Long id;
    private String name;
}
