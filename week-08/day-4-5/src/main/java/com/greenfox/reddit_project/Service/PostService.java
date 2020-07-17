package com.greenfox.reddit_project.Service;

import com.greenfox.reddit_project.Model.Post;
import com.greenfox.reddit_project.Repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostService {

    private PostRepository postRepository;
    private Integer pageCounter;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
        this.pageCounter = 1;
    }

    public List<Post> getPosts() {
        return postRepository.findAll().stream()
                .sorted(Comparator.comparingInt(Post::getVotes).reversed())
                .limit(10)
                .collect(Collectors.toList());
    }

    public List<Post> getPagedPosts(Integer page) {
        int numbersOfPosts = page * 10;
        return postRepository.findAll().stream()
                .sorted(Comparator.comparingInt(Post::getVotes).reversed())
                .skip(numbersOfPosts - 10)
                .limit(10)
                .collect(Collectors.toList());
    }

    

    public void savePost(Post post) {
        postRepository.save(post);
    }

    public void increment(Long id) {
        Post post = postRepository.findById(id).get();
        post.incrementVote();
        postRepository.save(post);
    }

    public void decrement(Long id) {
        Post post = postRepository.findById(id).get();
        post.decrementVote();
        postRepository.save(post);
    }

    public Integer getPageCounter() {
        return pageCounter;
    }

    public Integer incrementPageCounter() {
        if (this.pageCounter < this.getPosts().size()) {
            this.pageCounter++;
        }
        return pageCounter;
    }

    public Integer decrementPageCounter() {
        if (pageCounter > 1) {
            this.pageCounter--;
        }
        return pageCounter;
    }
}
