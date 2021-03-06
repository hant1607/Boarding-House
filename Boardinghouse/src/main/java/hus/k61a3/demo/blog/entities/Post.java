package hus.k61a3.demo.blog.entities;

import hus.k61a3.demo.blog.domains.Comment;
import hus.k61a3.demo.blog.domains.Topic;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Post {
    private String summary;
    private hus.k61a3.demo.blog.domains.Post post;
    private List<Comment> comments;
    private int numberOfComment;
    public Post(hus.k61a3.demo.blog.domains.Post post, List<Comment> comments  ) {
        this.post = post;
        this.comments = comments;
        this.summary = post.getContent().substring(0,200);
        this.numberOfComment = comments.size();
    }
}
