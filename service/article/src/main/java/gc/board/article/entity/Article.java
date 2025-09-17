package gc.board.article.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Table(name = "article")
@Entity
@Getter
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Article {
    @Id
    private Long articleId;
    private String title;
    private String content;
    private Long boardId;
    private Long writeId;
    private LocalDate createAt;
    private LocalDate modifiedAt;

    public static Article create(
            Long articleId,
            String title,
            String content,
            Long boardId,
            Long writeId
    ) {
        Article article = new Article();
        article.articleId = articleId;
        article.title = title;
        article.content = content;
        article.boardId = boardId;
        article.writeId = writeId;
        article.createAt = LocalDate.now();
        article.modifiedAt = LocalDate.now();
        return article;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
        this.modifiedAt = LocalDate.now();
    }
}
