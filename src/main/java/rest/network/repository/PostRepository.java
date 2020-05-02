package rest.network.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import rest.network.entity.PostEntity;

public interface PostRepository extends PagingAndSortingRepository<PostEntity, Long> {
}
