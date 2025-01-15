package study.kellycicd.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import study.kellycicd.domain.Post;
import study.kellycicd.repository.PostJpaEntity;
import study.kellycicd.repository.PostJpaRepository;

import java.util.List;
import java.util.NoSuchElementException;

@Slf4j
@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class PostService {

    private final PostJpaRepository postJpaRepository;

    @Transactional
    public void create(final String title, final String content, final String author) {
        final Post createdPost = new Post(title, content, author);
        postJpaRepository.save(new PostJpaEntity(createdPost));
        log.info("신규 게시글 저장됨. - {}", createdPost);
    }

    public void getError() {
        throw new NoSuchElementException("고객 정보 사라짐! 아주 심각한 에러가 발생했다!!!!!!!!");
    }

    public List<Post> getPosts() {
        return postJpaRepository.findAll()
                .stream()
                .map(PostJpaEntity::toDomain)
                .toList();
    }
}
