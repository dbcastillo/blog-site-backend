package com.blog.blogsite.repository;

import com.blog.blogsite.entity.Blogpost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogpostRepository extends JpaRepository<Blogpost, Long> {
}

