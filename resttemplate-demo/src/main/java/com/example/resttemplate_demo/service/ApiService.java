package com.example.resttemplate_demo.service;

import com.example.resttemplate_demo.dto.PostDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class ApiService {

    private static final Logger log = LoggerFactory.getLogger(ApiService.class);
    private final RestTemplate restTemplate;
    private static final String API_URL = "https://jsonplaceholder.typicode.com/posts";

    @Autowired
    public ApiService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<PostDto> getAllPosts() {
        try {
            ResponseEntity<PostDto[]> response = restTemplate.getForEntity(API_URL, PostDto[].class);
            PostDto[] posts = response.getBody();
            return Arrays.asList(posts != null ? posts : new PostDto[0]);
        } catch (HttpClientErrorException e) {
            log.error("Error fetching all posts: {}", e.getMessage());
            throw new RuntimeException("Error fetching posts: " + e.getMessage());
        }
    }

    public PostDto getPostById(Long id) {
        try {
            String url = API_URL + "/" + id;
            ResponseEntity<PostDto> response = restTemplate.getForEntity(url, PostDto.class);
            return response.getBody();
        } catch (HttpClientErrorException.NotFound e) {
            log.error("Post not found with id: {}", id);
            throw new RuntimeException("Post not found with id: " + id);
        } catch (HttpClientErrorException e) {
            log.error("Error fetching post with id {}: {}", id, e.getMessage());
            throw new RuntimeException("Error fetching post: " + e.getMessage());
        }
    }

    public PostDto createPost(PostDto postDto) {
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            
            HttpEntity<PostDto> request = new HttpEntity<>(postDto, headers);
            
            ResponseEntity<PostDto> response = restTemplate.postForEntity(
                API_URL, 
                request, 
                PostDto.class
            );
            
            return response.getBody();
        } catch (HttpClientErrorException e) {
            log.error("Error creating post: {}", e.getMessage());
            throw new RuntimeException("Error creating post: " + e.getMessage());
        }
    }

    public PostDto updatePost(Long id, PostDto postDto) {
        try {
            String url = API_URL + "/" + id;
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            
            HttpEntity<PostDto> request = new HttpEntity<>(postDto, headers);
            
            ResponseEntity<PostDto> response = restTemplate.exchange(
                url, 
                HttpMethod.PUT, 
                request, 
                PostDto.class
            );
            
            return response.getBody();
        } catch (HttpClientErrorException e) {
            log.error("Error updating post with id {}: {}", id, e.getMessage());
            throw new RuntimeException("Error updating post: " + e.getMessage());
        }
    }

    public void deletePost(Long id) {
        try {
            String url = API_URL + "/" + id;
            restTemplate.delete(url);
        } catch (HttpClientErrorException e) {
            log.error("Error deleting post with id {}: {}", id, e.getMessage());
            throw new RuntimeException("Error deleting post: " + e.getMessage());
        }
    }
}