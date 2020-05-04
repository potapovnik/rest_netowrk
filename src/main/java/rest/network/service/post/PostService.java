package rest.network.service.post;

import org.springframework.stereotype.Service;
import rest.network.dto.PostDto;
import rest.network.entity.PostEntity;
import rest.network.entity.UserEntity;
import rest.network.mappers.PostEntityMapper;
import rest.network.repository.PostRepository;
import rest.network.service.abstr.AbstractCrudService;

import java.util.List;

@Service
public class PostService extends AbstractCrudService<PostEntity, PostDto, Long, PostRepository> {
    public PostService(PostRepository repository, PostEntityMapper mapper) {
        super(repository, mapper);
    }

    public List<PostDto> getByCreator(Long creatorId) {
        return mapper.toDto(
                repository.getByCreatorId(creatorId)
        );
    }
}
