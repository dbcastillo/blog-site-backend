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
                    .title("5 Tips on Surviving a Coding Bootcamp")
                    .content("Maybe you just got accepted into a coding bootcamp. Maybe you are currently looking at your options and not sure if a bootcamp is for you. Either way, here is some insight that will prepare you for your first week at a coding bootcamp. If I could go back to the days before I started my bootcamp, here are the top 5 tips I wish I knew:\n" +
                            "\n" +
                            "#1: Don’t underestimate the prep-work.\n" +
                            "“They’ve accepted me into the program, and I know how to code, so I’m good!” No! The prep-work is exactly that…work you do to “prep” yourself for when you actually start the bootcamp. Some are optional and some are mandatory, but are you really just aspiring to just finish a bootcamp or to land a job in a new career? Then the prep-work is a no-brainer. Looking back, I would have absolutely spent more time studying the prep-work, seeing how it really set the foundations needed to be successful in the first few weeks of the program.\n" +
                            "\n" +
                            "#2: Don’t neglect self care. \n" + "Basically, just take care of yourself! Regular exercise will get you fit, help relieve stress, and is just a nice way to take a break from coding. And eating healthy foods will just naturally make you feel better, prevent you from feeling sluggish and give you more energy — who wouldn’t want that? There’s more to you than just code. Neglecting self-care can lead to fatigue or even burnout. Take breaks. Get rest. Have “me” time. Set some time aside for your favorite hobby. You deserve it, and your body will thank you.\n" +
                            "\n" +
                            "#3: Don’t compare yourself to your fellow coders.\n" +
                            "I can’t stress this one enough. Seriously, stay in your lane! My friend once told me that “Comparison is the thief of joy” (quoting T. Roosevelt). Every time I compared myself, my learning pace and what I was doing to my fellow coders, it made me insecure about my own progress. I was constantly feeling like I was slow, or horribly behind, or even like I didn’t belong there. But then I talked to my instructor and they reminded me not to compare, but just give it my all and refer to any of the instructors if I have questions, feel lost, or unsure of my progress. Run the race and stay in your lane. Comparison will only slow you down.\n" +
                            "\n" +
                            "#4: There’s no such thing as a dumb question.\n" +
                            "I once had an instructor tell me that an engaged student is one that is always asking questions, especially with new material. Remember, you’re learning things you’ve never seen before, so no question is a dumb one, even if you think so." + "\n" + "We’re all in this together, so don’t worry. Even if you need them to repeat what they just said because you weren’t listening…ask! Don’t let unanswered questions stay unanswered and put your pride and passivity aside and raise that hand…raise it often!\n" +
                            "\n" +
                            "#5: Manage your time well.\n" +
                            "Generally bootcamps are 12–15 weeks, give or take, but time will fly. You’re learning so much material in a short time frame, so every second counts. Don’t waste any of it! Believe me, you’ll regret it. It’s simple: you’re paying these people to give you the tools needed to become a developer and make a successful career change, so time wasted is money wasted.\n" + "Set a schedule and stick to it! Set your priorities early on so you know where to focus your time. Prepare for emergencies and the unexpected since…well, life can be unexpected sometimes. Taking time to manage your time will absolutely help you make the most of it!\n")
                    .imageUrls(Arrays.asList("https://miro.medium.com/v2/resize:fit:300/format:webp/1*i047_rGO8UnADcDE3rkO6w.jpeg", "https://media4.giphy.com/media/v1.Y2lkPTc5MGI3NjExcWs2a3RoZjdjZzUxNnBzcXdhcWN3bzNrdDg3YzUxN2l2NmVxNGVxZSZlcD12MV9pbnRlcm5hbF9naWZfYnlfaWQmY3Q9Zw/g8CJl0epg71MQ/giphy.gif", "https://media3.giphy.com/media/v1.Y2lkPTc5MGI3NjExMzg0dTNnZWwzeXp3b2s4cjVsamVlMXYwbDU3b28zZWtmZ2V4ejhrcCZlcD12MV9pbnRlcm5hbF9naWZfYnlfaWQmY3Q9Zw/sh3J3YR2emQkE/giphy.gif", "https://media1.giphy.com/media/v1.Y2lkPTc5MGI3NjExMzBxMzBoazE1a2lycm50MXZ1OWxiN2tlbjQ4YW93NjZ1ZDd4MGd4dSZlcD12MV9pbnRlcm5hbF9naWZfYnlfaWQmY3Q9Zw/l0HFkA6omUyjVYqw8/giphy.gif"))
                    .createdAt(LocalDateTime.of(2018, 7, 29, 0, 0, 0))
                    .updatedAt(LocalDateTime.of(2018, 7, 29, 0, 0, 0))
                    .build();

            Blogpost blogpost2 = Blogpost.builder()
                    .title("This is my second blog post")
                    .content("This is the content of my second blog post. It will have a few sentences, " +
                            "maybe even a paragraph or two of helpful info")
                    .imageUrls(Arrays.asList("https://picsum.photos/202", "https://picsum.photos/203"))
                    .createdAt(java.time.LocalDateTime.now().minusDays(3))
                    .updatedAt(java.time.LocalDateTime.now().minusDays(3))
                    .build();

            Blogpost blogpost3 = Blogpost.builder()
                    .title("This is my third blog post")
                    .content("This is the content of my third blog post. It will have a few sentences, " +
                            "maybe even a paragraph or two of helpful info")
                    .imageUrls(Arrays.asList("https://picsum.photos/204", "https://picsum.photos/205"))
                    .createdAt(java.time.LocalDateTime.now().minusDays(1))
                    .updatedAt(java.time.LocalDateTime.now().minusDays(1))
                    .build();

            blogpostService.addBlogpost(blogpost1);
            blogpostService.addBlogpost(blogpost2);
            blogpostService.addBlogpost(blogpost3);

            System.out.println("Data seeded successfully!");
        };
    }
}