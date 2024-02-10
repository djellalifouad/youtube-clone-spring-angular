package com.example.youtubeclone.model;


import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "Comment")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    private String id;
    private String text;
    private String authorId;

    private Integer likeCount;
    private Integer dislikeCount;


}
