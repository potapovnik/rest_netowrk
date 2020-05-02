package rest.network.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import rest.network.entity.UserEntity;

public interface UsersRepository extends PagingAndSortingRepository<UserEntity, Long> {
}
