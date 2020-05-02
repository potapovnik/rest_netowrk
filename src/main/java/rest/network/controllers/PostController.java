package rest.network.controllers;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rest.network.dto.PostDto;
import rest.network.entity.PostEntity;
import rest.network.service.PostService;

@RestController
@RequestMapping("post/")
@AllArgsConstructor
public class PostController {

    private PostService postService;

    @GetMapping("/{id}")
    public PostDto getPostById(@PathVariable("id") Long id) {
        return postService.getPost(id);
    }
}
