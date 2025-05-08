package com.blog.blogsite.repository;

import com.blog.blogsite.entity.Blogsection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogsectionRepository extends JpaRepository<Blogsection, Long> {
}
