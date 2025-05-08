package com.blog.blogsite.controller;

import com.blog.blogsite.entity.Blogpost;
import com.blog.blogsite.service.BlogpostService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/blogposts")
@RequiredArgsConstructor
@CrossOrigin(origins = {"http://localhost:5173", "https://your-frontend-domain.com"})
public class BlogpostController {
    private final BlogpostService blogpostService;

    @GetMapping
    public ResponseEntity<List<Blogpost>> getBlogposts() {
        List<Blogpost> blogposts = blogpostService.getBlogposts();
        return new ResponseEntity<>(blogposts, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Blogpost> getBlogpostById(@PathVariable Long id) {
        Blogpost blogpost = blogpostService.getBlogpostById(id);
        return new ResponseEntity<>(blogpost, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Blogpost> addEmployee(@RequestBody Blogpost blogpost) {
        Blogpost newBlogpost = blogpostService.addBlogpost(blogpost);
        return new ResponseEntity<>(newBlogpost, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Blogpost> updateBlogpost(@RequestBody Blogpost blogpost) {
        Blogpost updatedBlogpost = blogpostService.updateBlogpost(blogpost);
        return new ResponseEntity<>(updatedBlogpost, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteBlogpost(@PathVariable Long id) {
        blogpostService.deleteBlogpost(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
