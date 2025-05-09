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
                            "#2: Don’t neglect self care.\n" +
                            "Basically, just take care of yourself! Regular exercise will get you fit, help relieve stress, and is just a nice way to take a break from coding. And eating healthy foods will just naturally make you feel better, prevent you from feeling sluggish and give you more energy — who wouldn’t want that? There’s more to you than just code. Neglecting self-care can lead to fatigue or even burnout. Take breaks. Get rest. Have “me” time. Set some time aside for your favorite hobby. You deserve it, and your body will thank you.\n" +
                            "\n" +
                            "#3: Don’t compare yourself to your fellow coders.\n" +
                            "I can’t stress this one enough. Seriously, stay in your lane! My friend once told me that “Comparison is the thief of joy” (quoting T. Roosevelt). Every time I compared myself, my learning pace and what I was doing to my fellow coders, it made me insecure about my own progress. I was constantly feeling like I was slow, or horribly behind, or even like I didn’t belong there. But then I talked to my instructor and they reminded me not to compare, but just give it my all and refer to any of the instructors if I have questions, feel lost, or unsure of my progress. Run the race and stay in your lane. Comparison will only slow you down.\n" +
                            "\n" +
                            "#4: There’s no such thing as a dumb question.\n" +
                            "I once had an instructor tell me that an engaged student is one that is always asking questions, especially with new material. Remember, you’re learning things you’ve never seen before, so no question is a dumb one, even if you think so.\n" +
                            "We’re all in this together, so don’t worry. Even if you need them to repeat what they just said because you weren’t listening…ask! Don’t let unanswered questions stay unanswered and put your pride and passivity aside and raise that hand…raise it often!\n" +
                            "\n" +
                            "#5: Manage your time well.\n" +
                            "Generally bootcamps are 12–15 weeks, give or take, but time will fly. You’re learning so much material in a short time frame, so every second counts. Don’t waste any of it! Believe me, you’ll regret it. It’s simple: you’re paying these people to give you the tools needed to become a developer and make a successful career change, so time wasted is money wasted.\n" +
                            "Set a schedule and stick to it! Set your priorities early on so you know where to focus your time. Prepare for emergencies and the unexpected since…well, life can be unexpected sometimes. Taking time to manage your time will absolutely help you make the most of it!")
                    .imageUrls(Arrays.asList("https://miro.medium.com/v2/resize:fit:720/format:webp/1*i047_rGO8UnADcDE3rkO6w.jpeg"))
                    .createdAt(LocalDateTime.of(2018, 7, 29, 0, 0, 0))
                    .updatedAt(LocalDateTime.of(2018, 7, 29, 0, 0, 0))
                    .build();

            Blogpost blogpost2 = Blogpost.builder()
                    .title("How Coding Is a Lot Like Planking")
                    .content("As I reflect on my coding journey so far, I can see how the early stages are similar to the experience of planking (Planking: You’re in a pushup-like position, but your forearms are holding you up, and you hold this position for a period of time, which exercises your abs). I’d like to get into the details of the similarities between coding and planking, while also explaining how I fell in love with coding. It’s helpful to think about the similarities between the two in terms of phases. Let’s walk thru them.\n" +
                            "\n" +
                            "Phase 1 “Consistency”\n" +
                            "My love for coding started when a good friend suggested I try out Codeacademy, eventually leading to me trying it out and wanting to code all the time. My love for planking started when I joined the Plank Club at my coding bootcamp. I enjoy coding and planking, but it has taken time to develop the necessary skills. Coding can be difficult and frustrating. I struggled at times, early on as I was trying to teach myself a coding language that was new to me. Ruby methods and iterators were very scary in the beginning, but the constant repetition/practice/consistency eventually led to my growth in understanding Ruby and acceptance into a rigorous coding program. Likewise, after my first day of planking at Plank Club, I only lasted 30 seconds of the allotted 2 minutes and wondered if I should even be planking in the first place. It was hard at first, but consistency is how I improved and eventually progressed to a 2 minute plank in a few weeks.\n" +
                            "\n" +
                            "Phase 2 “Collaboration”\n" +
                            "Plank Club has become so much more than just a nice little break from coding. I enjoy the camaraderie and support as well. If nobody wanted to plank, and it was literally just myself, I think I’d eventually just stop doing it. The fact that there are others there who share a similar goal, willing to give me a random high-five after a round of planking, and show up daily with me, pushes me to plank even when I don’t feel like it. Same goes with coding. I can only do so much on my own. And as developers in the field we’re going to be working with others and collaborating and explaining our code. Collaborative skills are a must! I enjoy coding with others, learning from them, combining minds, tackling problems together, and just having the ability to do more with others than I’d be able to do on my own. When I was learning code on my own and solving problems, it was a lot different than learning alongside others. I don’t mind coding on my own, but collaborative efforts are also very helpful and beneficial.\n" +
                            "\n" +
                            "Phase 3 “Cherish”\n" +
                            "The only reason I’m even doing this coding bootcamp, making all these sacrifices, and spending all day coding is because I genuinely love it. There’s no way I’d be here if I didn’t love coding. Same with Plank Club. There’s no way I’d show up everyday if I didn’t absolutely enjoy it. In regards to coding, I’ve found something I love, and I want to learn the skills necessary to get better at it and be able to do it for a living. When I’m tired, frustrated, or just in the midst of struggling to learn a new concept, my love for coding is what keeps me going. Likewise, my desire to stay fit and my dedication to my fellow plankers is what keeps me going even when I don’t feel like planking. I love coding and I love planking. Do what you love!")
                    .imageUrls(Arrays.asList("https://miro.medium.com/v2/resize:fit:720/format:webp/1*-xsZPn8LE_w8xP5lv3aFcA.jpeg"))
                    .createdAt(LocalDateTime.of(2018, 8, 7, 0, 0, 0))
                    .updatedAt(LocalDateTime.of(2018, 8, 7, 0, 0, 0))
                    .build();

            Blogpost blogpost3 = Blogpost.builder()
                    .title("Music + Coding = Sonic PI")
                    .content("I love music. I love listening to it and creating it. I remember getting very excited when I found out that my Mac’s Terminal has a built-in functionality to play music. I was so excited that I decided to use that functionality for my first Ruby project at Flatiron. As I started to look into other connections between coding and music, I eventually found my way to Sonic Pi. As I read articles, watched videos, and started to gain a better understanding of Sonic Pi, I was blown away!\n" +
                            "\n" +
                            "What is Sonic PI?\n" +
                            "Lets start with Raspberry PI. The goal was to create a low cost computer accessible to all people. It is the size of a credit card and costs about $30. Raspberry PI was made to encourage people all over the world to learn programming. Back to Sonic PI, it is a program designed to be run on the Raspberry PI. It was developed in a classroom with teachers and teaches coding and music concepts at the same time. It started out with the goal of teaching kids about computer science, but eventually morphed into becoming a musical instrument, in and of itself, with Ruby code as the interface to create music. It is simple enough for young children to learn, yet powerful enough for music pros to interact with. Users are able to learn sequences, repetition, looping, variables, and sorting…all of which relate to music and coding. It is available as a free download online, with an extensive community for support and free tutorials. There is also research and evidence to show that it is effective and that many people have benefitted from it.\n" +
                            "\n" +
                            "How Does it work?\n" +
                            "Here is a sample of Ruby code in the Sonic PI. The founder of Flatiron School actually wrote this code that is a snippet of Taylor Swift’s “Shake it off”. Since Ruby was made to be user friendly and easy to work with, this code shouldn’t be too difficult for someone new to coding. The instrument and beats per minute are defined at the top. The melody is a method defined with several “play” and “sleep” functionality. You’ll notice after the word “play” there is a set of parentheses with a colon, a letter, and a number. The letter and number combination indicate a music chord. The colon before the music chord indicates that it is a symbol. Putting it together, the play method takes in a music chord as a symbol, which in turn, will play that chord. The sleep function, simply pauses for 0.5 seconds before moving to the next play function.\n" +
                            "\n" +
                            "My Thoughts and Experience\n" +
                            "I think Sonic PI is the future of music. I actually tried it out myself and loved it. I like how easy it was to use, yet powerful enough to create intricate compositions. I’m no professional musician, but I love how I was able to use Ruby code to make something that sounded pretty cool. I think it’s a great outlet for creativity and has the potential to develop other important skills such as discipline, coordination, memorization, collaboration, and even self confidence since the user is able to learn quickly and have immediate feedback. I’m excited for the future of Sonic PI!!!")
                    .imageUrls(Arrays.asList("https://miro.medium.com/v2/resize:fit:720/format:webp/1*E9f7IqUET4GCyU_oOBs--Q.jpeg"))
                    .createdAt(LocalDateTime.of(2018, 8, 30, 0, 0, 0))
                    .updatedAt(LocalDateTime.of(2018, 8, 30, 0, 0, 0))
                    .build();

            Blogpost blogpost4 = Blogpost.builder()
                    .title("4 Tips on Tackling JavaScript for the First Time")
                    .content("I’m halfway through my coding bootcamp and I can’t believe how much Javascript I’ve learned in 2 weeks! Having never learned this language before, this was no easy task. I’ve learned more than just the language, I’ve learned how to struggle well, how to study in a way that works for me, how to deal with stress better, and how to keep learning even when I keep failing and it feels like I’m not progressing.\n" +
                            "\n" +
                            "1. Getting Used to Being Uncomfortable\n" +
                            "So much easier said than done! I remember being told early on that learning a new language is hard and that you have to get used to being uncomfortable. You’re going to make mistakes, misuse things, and get it wrong several times…but then you’ll start getting it right too. Progress will sometimes be a flat line, but then it might be up and down like a roller coaster. There were many times I hated being uncomfortable and became very frustrated, but I remember being told that the “uncomfortable” place is where you learn. It’s where you get stretched and challenged the most, and if you can stick with it, you’ll grow. So even though my functions were failing, I forgot semicolons, and I couldn’t understand how to properly append my elements, I stuck with it, eventually figured it out, and with enough repetition, it became second nature.\n" +
                            "\n" +
                            "2. Embracing Study Groups…but Avoiding Them Too!\n" +
                            "At first I exclusively only wanted to study in groups. I wanted to be able to learn from others and have strength in numbers. But then I started to see that I also needed time to struggle with the material myself and figure it out on my own. In fact, I found that I needed more moments like that where I learn on my own. While a group setting can be helpful sometimes, there’s also the possibility that you won’t be able to struggle and learn it on your own because someone else already knew the answer, quickly went through it, then moved on. There’s also the possibility of the group moving too slow or too fast and it’s not always a perfect flow every time. To summarize, I personally lean towards more self study, utilizing study groups if I know the direction they’re going and believe that I would actually benefit from it.\n" +
                            "\n" +
                            "3. How to Deal With Stress Better\n" +
                            "There was so much information to take in and learn. So many small projects, labs, and it was overwhelming at times. Not to mention, getting used to messing up and trying to understand all the major concepts. I had moments where it was hard to sleep and moments where I just felt overwhelmed and stressed. I knew I had to manage my stress or I’d go crazy. REST and RELAXATION! That’s the best way I can answer this. I needed to get adequate rest and I needed to do whatever works for me in regards to relaxing. So for me it was exercise, listening to music, taking breaks with friends, and enjoying the sunrises I was fortunate to see every morning. I was able to relax and rest and that was very helpful to my self care. It might look different for someone else, but do whatever is necessary to relax and get rest…you’re gonna need it after all that coding!\n" +
                            "\n" +
                            "4. How to Get Better at It\n" +
                            "Every time I asked others how I can get better at Javascript, they basically all said the same thing in different ways…just keep building stuff! Keep using it! I had several small projects to keep me busy and when I encountered something that didn’t make sense, I re-watched recorded lectures, looked at my notes, asked someone, or reviewed the online docs. When I had lectures or labs, I tried to code along so that I’d get used to the syntax and how it works. Ultimately, it’s the constant repetition of coding out small projects that helped solidify major JS concepts and led to my passing my major JS exam!")
                    .imageUrls(Arrays.asList("https://miro.medium.com/v2/resize:fit:720/format:webp/1*tz58NuOcsP278JpoZAke_Q.jpeg"))
                    .createdAt(LocalDateTime.of(2018, 9, 9, 0, 0, 0))
                    .updatedAt(LocalDateTime.of(2018, 9, 9, 0, 0, 0))
                    .build();

            Blogpost blogpost5 = Blogpost.builder()
                    .title("Life Post-Coding Bootcamp")
                    .content("Long time no blog! I do miss blogging as I do enjoy journaling and processing my thoughts and experiences this way. I’ve honestly been busy with interviews, code challenges, and job prep. It’s felt like a long 3 months since I graduated but after several interviews I’m excited to say that I recently received a job offer from an awesome company I’ve been talking to. Here’s a brief summary of what life has been like after I graduated my coding bootcamp.\n" +
                            "\n" +
                            "1. Networking\n" +
                            "\n" +
                            "2. Practicing coding and algorithms\n" +
                            "\n" +
                            "3. Moving from NYC to CHI\n" +
                            "\n" +
                            "4. Interviews and code challenges\n" +
                            "\n" +
                            "5. Emily King Concert\n" +
                            "\n" +
                            "Networking\n" +
                            "\n" +
                            "I haven’t been going to any meetups, but I’ve talked to a few people (mostly people within my network). A friend of my cousin has been a Developer for 20+ years and had some helpful tips for me. I connected with an old friend from Jersey who I recently found out was a Developer (didn’t know before) and it was good to catch up. I grabbed wings with a fellow grad who recently landed his first Dev job. None of my networking led to anything specifically, but it was good to catchup with people and get to know others in the field. I enjoyed talking about code but also getting to know some of these people outside of code.\n" +
                            "\n" +
                            "Practicing code and algorithms\n" +
                            "\n" +
                            "As part of preparing for interviews and getting a job, I’ve been practicing code through HackerRank, Codewars, Pramp, LearnCo, and pair programming with my Dev friends. Also, I have this thick book called “Cracking the Coding Interview” and that’s been very helpful as well. Mock interviews were helpful for me as well as I felt a little more prepared. With each technical/non-technical interview, I feel like a got a little better each time. The constant practice was helpful for nerves, but also skill.\n" +
                            "\n" +
                            "Moving from NYC to CHI\n" +
                            "\n" +
                            "Shout out to my awesome friend Vivianne! She’s actually the reason I’ve made it this far. My journey as a Developer started when she suggested I should try learning to code through Codecademy. I moved from NYC back to CHI. It’s good to be back home. I didn’t miss the cold though. As I write this, its going to be -12 degrees in two days…that’s the high! Yikes. But it’s still good to be back and close to family and plentiful tech jobs!\n" +
                            "\n" +
                            "Interviews and code challenges\n" +
                            "\n" +
                            "I’ve been fortunate to have several interviews recently. A few led to final round. I’ve had so many different types of code challenges for these interviews. Some were as straightforward as solving a single problem. Others were as extensive as creating a full web app in a weeks time. Each time, I felt the urge to keep practicing and honing in on my skills. Technical interviews are no joke! I’ve had the opportunity to do a few mock technical interviews, and that was helpful to get the experience and also get less nervous when I had real interviews coding in front of a possible employer.\n" +
                            "\n" +
                            "Emily King concert\n" +
                            "\n" +
                            "One of my favorite artists is Emily King and I’m was excited to have seen her live in concert and have the rare opportunity to meet her in person. I got the VIP meet and greet tickets. I was very star-struck and slightly awkward during conversation, but nonetheless, it was a cool experience to look back on. If you’ve never heard of her, which is probably true, she’s a singer/songwriter with a great voice and I could listen to her all day!")
                    .imageUrls(Arrays.asList("https://miro.medium.com/v2/resize:fit:720/format:webp/1*rjumKVukMgwQ5IOPEi2UMw.jpeg"))
                    .createdAt(LocalDateTime.of(2019, 2, 24, 0, 0, 0))
                    .updatedAt(LocalDateTime.of(2019, 2, 24, 0, 0, 0))
                    .build();

            Blogpost blogpost6 = Blogpost.builder()
                    .title("Adventures of a Software Engineering Coach Pt 1")
                    .content("One of my students recently asked “So, Derick do you still blog as a Developer?” That really caught me off guard! I felt very guilty, lol! I mean, I’ve been busy! A few really big life events have recently happened to me, I’m still adjusting to my first teaching job, and there’s so much to learn as I assist junior developers in their journey. But of course I didn’t explain all that. It’s just a quick snapshot of what went on in my head a few seconds after I was asked the question. So I just ended up telling him that I haven’t prioritized blogging since I’m currently preoccupied with everything related to teaching for the first time.\n" +
                            "\n" +
                            "So, I plan to start blogging more regularly. I mean, I’m still very much in love with code, love teaching it thus far…and its only right that I chronicle my adventures! It’s been a little over 2 months and I love it here so far! I serve as a Software Engineering Coach at Flatiron, combining my passion for people and helping others. I completed the program in New York and spend my time supporting students as they conquer labs, code issues, projects, and code challenges in their journey as developers.\n" +
                            "\n" +
                            "One of the big lessons I’ve been learning since I’ve started has been PASSION. I remember being told that knowledge of code is important, but even more important is having a passion for the students and their success and everything else will follow. I absolutely have a passion for what I do! In the beginning I put in many hours trying to study the curriculum, work flows, and even put together a breakout review session for struggling students. I quickly got burnt out, but I’m getting better at knowing when to have late nights and when to call it a day. Also, having been a student myself less than a year ago, I know exactly what they’re going thru, can empathize with them when they start freaking out, and willing to do whatever I need to do to help them get to where they need to be. I might not have been a perfect coach in the past few months (was a bit rusty on my Redux.js and had to brush up), but I think my passion has positively impacted several students. I’ve received some positive feedback a few times. I know there is much much more for me to learn as I continue to learn, grow, and start new adventures. I’m definitely open to constructive criticism and advice since I wanna grow and get better.\n" +
                            "\n" +
                            "I just had my first cohort of students graduate on Friday. I was so extremely nervous when I gave my speech, but…it went well. Now I have a new batch of students coming in on Monday. I’m excited and nervous at the same time. Obviously more excited. Excited at the opportunity to help and spread the love of code. Can’t wait for this new chapter in my adventures as a Software Engineering Coach. I’ll definitely blog again soon. Until next time…")
                    .imageUrls(Arrays.asList("https://miro.medium.com/v2/resize:fit:720/format:webp/1*nJEmY4d1JBYK2SFWa9cd1w.jpeg"))
                    .createdAt(LocalDateTime.of(2019, 8, 25, 0, 0, 0))
                    .updatedAt(LocalDateTime.of(2019, 8, 25, 0, 0, 0))
                    .build();

            Blogpost blogpost7 = Blogpost.builder()
                    .title("Adventures of a Software Engineering Coach Pt 2")
                    .content("Lectures/Staying Ahead/Paying Attention\n" +
                            "\n" +
                            "My students are at the end of week 1 of Mod 2. I recently gave a lecture on RESTful routing as part of Sinatra’s MVC architecture. Also gave a lecture on ORMs a few weeks ago. I was really surprised at how long it took to prepare. I mean, I’m a perfectionist so I wanted to go over it multiple times until if felt natural. I’ll get better as time passes. I try to be thorough and make sure I cover all bullet points and hit every concept they’re supposed to learn. Also, this is my first runaround, so I’m learning as I go. Since I want to eventually become a lead instructor and give more lectures, I will occasionally have an opportunity to lead lectures of my own and gain the experience and practice. I’m thankful that I will consistently be receiving feedback which will help me know what I’m doing well and what I can improve on. I still get nervous standing in front of an audience, but I’ve been getting better with that. I remind myself that in the context of my lecture they have chosen to be there, they want to hear what I have to say, they’re curious and want to learn, and I’ve done this before and have practiced, so I know what I’m talking about. Keeping all that in mind, I tend to chill out and just jump into it. I always try to take a break at least every 30 minutes, I try to make it fun and interactive, and I try to occasionally ask if everyone is still following and/or confused and want clarification. I haven’t hit my sweet spot yet, but I also haven’t put anyone to sleep, so I will keep trying and learning from my mistakes as well.\n" +
                            "\n" +
                            "I know the material and have gone through the same program I help teach, but to know something enough to teach it requires a very thorough understanding. Especially when the students have so many questions and are extremely curious. This means, I need to be on top of my languages. I try to stay ahead. I try to breeze through the material, do a select few labs, and make sure I’m familiar enough to be able to answer questions and throw together a review session if needed. I find that there has been a method or two that I might have been rusty on, and going through those motions gets me ready for some of the difficult questions and bug breaks I encounter with students. I obviously don’t know Ruby and JS exhaustively, but I know who and where to go to when I forget how to solve a certain problem. Obviously I want to be able to rely on my staff as least as possible and figure things out myself, but I’m getting there. Staying a few days ahead has seemed to prepare me for the days to come.\n" +
                            "\n" +
                            "I’ve also learned to pay attention to students well. I’ve noticed my coworker pays attention to learning styles, who works well with who, who picks things up the fastest, etc. I try to keep up and pay attention as well, since that influences how they will pair program, how they will interact with us and each other, etc. I’ve been learning that the closer we pay attention, the more we can be able to support them and adjust as needed. It’s been an interesting past few weeks. I have a great class! They seem to vibe well with each other and they always make me laugh. They had a wine and cake celebration when they all passed their first major exam. That was pretty cool! I’m excited at the road ahead for them, as they continue to learn new languages, build cool projects, and grow with each other. I’m glad that I get to be a part of their journey and support them, and its been really cool to see their love for code grow as the program continues. Not much left to say. Until next time…")
                    .imageUrls(Arrays.asList("https://miro.medium.com/v2/resize:fit:720/format:webp/1*s-w2ZoQ-7WMXfMeUHEd2-w.jpeg"))
                    .createdAt(LocalDateTime.of(2019, 9, 22, 0, 0, 0))
                    .updatedAt(LocalDateTime.of(2019, 9, 22, 0, 0, 0))
                    .build();

            Blogpost blogpost8 = Blogpost.builder()
                    .title("4 Things Software Engineering has taught me")
                    .content("Wowwwww! Almost 4 years since my last blog post, 4 different cities, and 2 jobs later! I’ve been busy! I’m currently working in IT at the 7-Eleven Support Center and it has been quite a journey! The Texas heat can be a bit much but I’ve grown to like it here. I’ve since gotten into rock climbing, DJ-ing, modeling, South Indian cooking, boxing, hiking, racing my mustang, and visited Bahamas and Aruba on vacay (so beautiful there)! I’ve learned so much along the way and wanted to share.\n" +
                            "\n" +
                            "1. Don’t be afraid to ask questions\n" +
                            "I’ve learned the importance of humility lol! Even with years of experience, there’s always something new to learn. I feel that it’s very important to never have a “know it all” kind of attitude, but always be learning. So, usually at the start of a project, I tend go solo for a really long time and barely ask questions until I’m like, really really stuck! I’ve learned that this isn’t the way to go! I know its usually just me wanting to “look good” and crush it. But truly, if you’re stuck for more than an hour or two on a feature or something time sensitive, you’re spinning your wheels and wasting time if you’re not asking for help at that point. Sometimes just gotta put aside the pride and desire to “look good” and just ask for help if stuck for too long. Saves time and headache down the line, trust me!\n" +
                            "\n" +
                            "2. Never stop coding and learning\n" +
                            "As mentioned in the previous point, we should never stop learning. I mean, if we’re going to grow as Software Engineers, or just in general, we should always keep up with our skills and the trends in our industry so we can be at the top of our game and our craft! But especially in tech, the landscape is ever changing, and it’s our responsibility to keep up with the latest updates to languages, trends, better ways of doing things, and even the community that we belong to. Which is a nice transition to the next point lol!\n" +
                            "\n" +
                            "3. Keep up with the community\n" +
                            "Just like with anything else, we really do need each other. Life wasn’t meant to be lived alone. Keep up with your fellow engineers, peers, and people you’ve met and connected with along the way. Whether it’s from a coding program, a meetup, some event, a hackathon…keep up with those relationships. We can always learn from eachother, encourage one another, support each other, and connect each other to jobs or people or other meaningful connections that help out. In fact, 2 out of my 4 jobs I’ve had as a Software Engineer were actually found because of the connections I had and kept up with along the way! So cultivate those connections, as we can truly grow and learn so much from eachother!\n" +
                            "\n" +
                            "4. Have a side project that you actually like\n" +
                            "This goes hand in hand with the concept of always coding and learning to make sure you’re on top of your skills and your craft. No better way to do that than to build something you actually like! This will make you excited to code, will keep those skills fresh, and you’ll be excited at the finished product and want to show your friends and family. One of my recent side projects was updating my personal portfolio website. I kept it pretty simple, and I have ideas to improve it, but its good for now and I was super excited to show all my friends and family what I built.")
                    .imageUrls(Arrays.asList("https://miro.medium.com/v2/resize:fit:720/format:webp/0*9PIO0-eEIXOGImpa"))
                    .createdAt(LocalDateTime.of(2023, 9, 13, 0, 0, 0))
                    .updatedAt(LocalDateTime.of(2023, 9, 13, 0, 0, 0))
                    .build();

            blogpostService.addBlogpost(blogpost1);
            blogpostService.addBlogpost(blogpost2);
            blogpostService.addBlogpost(blogpost3);
            blogpostService.addBlogpost(blogpost4);
            blogpostService.addBlogpost(blogpost5);
            blogpostService.addBlogpost(blogpost6);
            blogpostService.addBlogpost(blogpost7);
            blogpostService.addBlogpost(blogpost8);

            System.out.println("Data seeded successfully!");
        };
    }
}