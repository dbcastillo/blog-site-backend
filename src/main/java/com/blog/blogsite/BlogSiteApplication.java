package com.blog.blogsite;

import com.blog.blogsite.entity.Blogpost;
import com.blog.blogsite.service.BlogpostService;
import java.time.LocalDateTime;
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
                    .title("This is my very first blog post")
                    .content("Hey, it's me Derick! I finally got my blogsite live on the internet. It's using dummy data for now but I made it responsive for mobile and web and will connect my actual blogs sometime soon. I'll also add styling and more great features soon. Thanks for visiting! (143-BC)")
                    .imageUrls(Arrays.asList("https://picsum.photos/299", "https://picsum.photos/298"))
                    .createdAt(LocalDateTime.of(2018, 7, 29, 0, 0, 0))
                    .updatedAt(LocalDateTime.of(2018, 7, 29, 0, 0, 0))
                    .build();

            Blogpost blogpost2 = Blogpost.builder()
                    .title("This is my second blog post")
                    .content("is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.")
                    .imageUrls(Arrays.asList("https://picsum.photos/202", "https://picsum.photos/203"))
                    .createdAt(java.time.LocalDateTime.now().minusDays(9))
                    .updatedAt(java.time.LocalDateTime.now().minusDays(9))
                    .build();

            Blogpost blogpost3 = Blogpost.builder()
                    .title("This is my third blog post")
                    .content("is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.")
                    .imageUrls(Arrays.asList("https://picsum.photos/204", "https://picsum.photos/205"))
                    .createdAt(java.time.LocalDateTime.now().minusDays(8))
                    .updatedAt(java.time.LocalDateTime.now().minusDays(8))
                    .build();

            Blogpost blogpost4 = Blogpost.builder()
                    .title("This is my fourth blog post")
                    .content("is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.")
                    .imageUrls(Arrays.asList("https://picsum.photos/304", "https://picsum.photos/305"))
                    .createdAt(java.time.LocalDateTime.now().minusDays(7))
                    .updatedAt(java.time.LocalDateTime.now().minusDays(7))
                    .build();

            Blogpost blogpost5 = Blogpost.builder()
                    .title("This is my fifth blog post")
                    .content("is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.")
                    .imageUrls(Arrays.asList("https://picsum.photos/306", "https://picsum.photos/307"))
                    .createdAt(java.time.LocalDateTime.now().minusDays(6))
                    .updatedAt(java.time.LocalDateTime.now().minusDays(6))
                    .build();

            Blogpost blogpost6 = Blogpost.builder()
                    .title("This is my sixth blog post")
                    .content("Hey, it's me, Derick Castillo! My blog is finally live on the web! I'll connect my actual blogs sometime soon and improve styling. Thanks for visiting! (143-BC)")
                    .imageUrls(Arrays.asList("https://picsum.photos/308", "https://picsum.photos/309"))
                    .createdAt(java.time.LocalDateTime.now().minusDays(5))
                    .updatedAt(java.time.LocalDateTime.now().minusDays(5))
                    .build();

            blogpostService.addBlogpost(blogpost1);
            blogpostService.addBlogpost(blogpost2);
            blogpostService.addBlogpost(blogpost3);
            blogpostService.addBlogpost(blogpost4);
            blogpostService.addBlogpost(blogpost5);
            blogpostService.addBlogpost(blogpost6);

            System.out.println("Data seeded successfully!");
        };
    }
}