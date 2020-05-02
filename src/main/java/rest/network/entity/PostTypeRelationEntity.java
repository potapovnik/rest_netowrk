package rest.network.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "post_type_relation", schema = "public", catalog = "rest_network")
@Data
public class PostTypeRelationEntity {


    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "post_type_relation_seq")
    @SequenceGenerator(name = "post_type_relation_seq", sequenceName = "post_type_relation_id_seq", allocationSize = 1)
    private Long id;

    @Column(name = "post_id")
    private Integer postId;

    @Column(name = "type_id")
    private Integer typeId;
}
