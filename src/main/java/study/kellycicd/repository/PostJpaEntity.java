package study.kellycicd.repository;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import study.kellycicd.domain.Post;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "post")
@Entity
public class PostJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;
    private String author;

    public PostJpaEntity(final Post post) {
        this.title = post.getTitle();
        this.content = post.getContent();
        this.author = post.getAuthor();
    }

    public PostJpaEntity(
            final Long id,
            final String title,
            final String content,
            final String author
    ) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public Post toDomain() {
        return new Post(title, content, author);
    }
}
