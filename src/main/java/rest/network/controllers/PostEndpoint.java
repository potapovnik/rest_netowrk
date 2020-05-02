package rest.network.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rest.network.controllers.abstr.AbstractCrudEndpoint;
import rest.network.dto.PostDto;
import rest.network.entity.PostEntity;
import rest.network.service.post.PostService;

@RestController
@RequestMapping("post")
public class PostEndpoint extends AbstractCrudEndpoint<PostEntity, PostDto, Long> {
    public PostEndpoint(PostService service) {
        super(service);
    }
}
