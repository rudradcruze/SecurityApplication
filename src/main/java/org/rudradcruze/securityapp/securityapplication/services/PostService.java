package org.rudradcruze.securityapp.securityapplication.services;

import org.rudradcruze.securityapp.securityapplication.dto.PostDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface PostService {
    PostDto createPost(PostDto postDto);
    PostDto getPostById(Long id);
    List<PostDto> getPosts();
    PostDto updatePost(Long id, PostDto postDto);
    void deletePost(Long id);
    PostDto updatePartial(Long id, Map<String, Object> updates);
}
