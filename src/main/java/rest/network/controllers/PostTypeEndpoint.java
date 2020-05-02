package rest.network.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rest.network.controllers.abstr.AbstractCrudEndpoint;
import rest.network.dto.PostTypeDto;
import rest.network.entity.PostTypeEntity;
import rest.network.service.post.PostTypeService;

@RestController
@RequestMapping("post-type")
public class PostTypeEndpoint extends AbstractCrudEndpoint<PostTypeEntity, PostTypeDto, Long> {
    public PostTypeEndpoint(PostTypeService service) {
        super(service);
    }
}