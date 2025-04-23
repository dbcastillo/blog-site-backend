package com.blog.blogsite;

import com.blog.blogsite.entity.Blogpost;
import com.blog.blogsite.service.BlogpostService;
import java.util.Arrays;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BlogSiteApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogSiteApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(BlogpostService blogpostService) {
        return args -> {
            Blogpost blogpost1 = Blogpost.builder()
                    .title("This is my first blog post")
                    .content("This is the content of my first blog post. It will have a few sentences, " +
                            "maybe even a paragraph or two of helpful info")
                    .imageUrls(Arrays.asList("https://picsum.photos/200", "https://picsum.photos/200"))
                    .createdAt(java.time.LocalDateTime.now())
                    .updatedAt(java.time.LocalDateTime.now())
                    .build();

            Blogpost blogpost2 = Blogpost.builder()
                    .title("This is my second blog post")
                    .content("This is the content of my second blog post. It will have a few sentences, " +
                            "maybe even a paragraph or two of helpful info")
                    .imageUrls(Arrays.asList("https://picsum.photos/200", "https://picsum.photos/200"))
                    .createdAt(java.time.LocalDateTime.now())
                    .updatedAt(java.time.LocalDateTime.now())
                    .build();

            Blogpost blogpost3 = Blogpost.builder()
                    .title("This is my third blog post")
                    .content("This is the content of my third blog post. It will have a few sentences, " +
                            "maybe even a paragraph or two of helpful info")
                    .imageUrls(Arrays.asList("https://picsum.photos/200", "https://picsum.photos/200"))
                    .createdAt(java.time.LocalDateTime.now())
                    .updatedAt(java.time.LocalDateTime.now())
                    .build();

            blogpostService.addBlogpost(blogpost1);
            blogpostService.addBlogpost(blogpost2);
            blogpostService.addBlogpost(blogpost3);

            System.out.println("Data seeded successfully!");
        };
    }
}
