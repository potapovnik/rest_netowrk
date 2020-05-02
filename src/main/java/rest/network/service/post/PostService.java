package rest.network.service.post;

import org.springframework.stereotype.Service;
import rest.network.dto.PostDto;
import rest.network.entity.PostEntity;
import rest.network.mappers.PostEntityMapper;
import rest.network.repository.PostRepository;
import rest.network.service.abstr.AbstractCrudService;

@Service
public class PostService extends AbstractCrudService<PostEntity, PostDto, Long> {
    public PostService(PostRepository repository, PostEntityMapper mapper) {
        super(repository, mapper);
    }
}
