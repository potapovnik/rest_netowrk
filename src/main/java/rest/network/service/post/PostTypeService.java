package rest.network.service.post;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import rest.network.dto.PostTypeDto;
import rest.network.entity.PostTypeEntity;
import rest.network.mappers.PostTypeEntityMapper;
import rest.network.mappers.abstr.EntityMapper;
import rest.network.repository.PostTypeRepository;
import rest.network.service.abstr.AbstractCrudService;

@Service
public class PostTypeService extends AbstractCrudService<PostTypeEntity, PostTypeDto, Long> {

    public PostTypeService(
            PostTypeRepository repository,
            PostTypeEntityMapper mapper) {
        super(repository, mapper);
    }
}
