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
@CrossOrigin(origins = "http://localhost:5173")
public class BlogpostController {
    private final BlogpostService blogpostService;

    @GetMapping
    public ResponseEntity<List<Blogpost>> getBlogposts() {
        List<Blogpost> blogposts = blogpostService.getBlogposts();
        return new ResponseEntity<>(blogposts, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Blogpost> getEmployeeById(@PathVariable Long id) {
        Blogpost employee = blogpostService.getBlogpostById(id);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Blogpost> addEmployee(@RequestBody Blogpost employee) {
        Blogpost newEmployee = blogpostService.addBlogpost(employee);
        return new ResponseEntity<>(newEmployee, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Blogpost> updateEmployee(@RequestBody Blogpost employee) {
        Blogpost updatedEmployee = blogpostService.updateBlogpost(employee);
        return new ResponseEntity<>(updatedEmployee, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable Long id) {
        blogpostService.deleteBlogpost(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
