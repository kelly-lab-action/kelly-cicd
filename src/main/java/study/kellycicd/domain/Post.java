package study.kellycicd.domain;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class Post {

    private final String title;
    private final String content;
    private final String author;

    public Post(final String title, final String content, final String author) {
        validateTitle(title);
        validateContent(content);
        validateAuthor(author);

        this.title = title;
        this.content = content;
        this.author = author;
    }

    private void validateTitle(final String title) {
        if (title == null || title.isBlank() || title.length() > 100) {
            throw new IllegalArgumentException("게시글 제목은 100자 이하의 문자열만 입력할 수 있습니다. : " + title);
        }
    }

    private void validateContent(final String content) {
        if (content == null || content.isBlank() || content.length() > 1000) {
            throw new IllegalArgumentException("게시글 본문은 1000자 이하의 문자열만 입력할 수 있습니다. : " + content);
        }
    }

    private void validateAuthor(final String author) {
        if (author == null || author.isBlank() || author.length() > 8 || author.length() < 2) {
            throw new IllegalArgumentException("게시글 작성자 이름은 2글자 이상, 8자 이하의 문자열만 입력할 수 있습니다. : " + author);
        }
    }
}
