package com.example.resttemplate_demo;

import com.example.resttemplate_demo.dto.PostDto;
import com.example.resttemplate_demo.service.ApiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ResttemplateDemoApplication implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(ResttemplateDemoApplication.class);
    private final ApiService apiService;

    public ResttemplateDemoApplication(ApiService apiService) {
        this.apiService = apiService;
    }

    public static void main(String[] args) {
        SpringApplication.run(ResttemplateDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("=== Starting RestTemplate Demo ===");
        
        // GET all posts
        log.info("=== GET All Posts ===");
        apiService.getAllPosts().forEach(post -> log.info(post.toString()));
        
        // GET single post
        log.info("=== GET Post with ID 1 ===");
        PostDto post = apiService.getPostById(1L);
        log.info(post.toString());
        
        // POST new post
        log.info("=== CREATE New Post ===");
        PostDto newPost = new PostDto(null, 1L, "New Title", "New Body");
        PostDto createdPost = apiService.createPost(newPost);
        log.info("Created Post: {}", createdPost);
        
        // PUT update post
        log.info("=== UPDATE Post ===");
        PostDto updatedPost = new PostDto(1L, 1L, "Updated Title", "Updated Body");
        PostDto result = apiService.updatePost(1L, updatedPost);
        log.info("Updated Post: {}", result);
        
        // DELETE post
        log.info("=== DELETE Post ===");
        apiService.deletePost(1L);
        log.info("Post with ID 1 deleted");
        
        log.info("=== RestTemplate Demo Completed ===");
    }
}



//GET http://localhost:8080/api/posts
//GET http://localhost:8080/api/posts/1
//DELETE http://localhost:8080/api/posts/1
