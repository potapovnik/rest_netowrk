package rest.network.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import rest.network.controllers.abstr.AbstractCrudEndpoint;
import rest.network.dto.PostDto;
import rest.network.entity.PostEntity;
import rest.network.service.post.PostService;

import java.util.List;

@RestController
@RequestMapping("post")
public class PostEndpoint extends AbstractCrudEndpoint<PostEntity, PostDto, Long, PostService> {
    public PostEndpoint(PostService service) {
        super(service);
    }

    @GetMapping("by-creator")
    public List<PostDto> getByCreator(@RequestParam Long creatorId) {
        return service.getByCreator(creatorId);
    }
}
