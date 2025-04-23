package com.blog.blogsite.service;

import com.blog.blogsite.repository.BlogpostRepository;
import com.blog.blogsite.entity.Blogpost;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;



@Service
@RequiredArgsConstructor
public class BlogpostService {
    private final BlogpostRepository blogpostRepository;

    public List<Blogpost> getBlogposts(){
        return blogpostRepository.findAll();
    }

    public Blogpost getBlogpostById(Long id){
        return blogpostRepository.findById(id).orElse(null);
    }

    public Blogpost addBlogpost(Blogpost blogpost){
        return blogpostRepository.save(blogpost);
    }

    public Blogpost updateBlogpost(Blogpost blogpost){
        return blogpostRepository.save(blogpost);
    }

    public void deleteBlogpost(Long id){
        blogpostRepository.deleteById(id);
    }
}
