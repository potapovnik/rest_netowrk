package rest.network.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rest.network.entity.PostEntity;
import rest.network.entity.UserEntity;

import java.util.List;

public interface PostRepository extends JpaRepository<PostEntity, Long> {

    List<PostEntity> getByCreatorId(Long creatorId);
}
