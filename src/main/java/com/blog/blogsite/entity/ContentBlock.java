package com.blog.blogsite.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "content_blocks")
public class ContentBlock {
    public ContentBlock(String type, String value) {
        this.type = type;
        this.value = value;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;

    @Lob
    private String value;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "blogpost_id")
    @JsonIgnore
    private Blogpost blogpost;

}