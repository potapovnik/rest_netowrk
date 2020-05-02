package rest.network.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import rest.network.entity.PostTypeEntity;

public interface PostTypeRepository extends JpaRepository<PostTypeEntity, Long> {
}
