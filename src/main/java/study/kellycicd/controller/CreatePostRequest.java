package study.kellycicd.controller;

public record CreatePostRequest(
        String title,
        String content,
        String author
) {
}
