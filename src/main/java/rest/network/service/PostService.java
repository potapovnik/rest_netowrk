package rest.network.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import rest.network.dto.PostDto;
import rest.network.entity.PostEntity;
import rest.network.mappers.PostMapper;
import rest.network.repository.PostRepository;

@Service
@AllArgsConstructor
public class PostService {

    private PostRepository postRepository;
    private PostMapper postMapper;

    public PostDto getPost(Long id) {
        return postMapper.toDto(postRepository.findById(id).orElseThrow());
    }
}
