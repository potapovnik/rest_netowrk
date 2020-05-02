package rest.network.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import rest.network.entity.PostEntity;

public interface PostRepository extends JpaRepository<PostEntity, Long> {
}
