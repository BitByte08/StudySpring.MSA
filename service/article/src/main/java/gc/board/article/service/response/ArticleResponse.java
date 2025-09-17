package gc.board.article.service.response;

import gc.board.article.entity.Article;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@ToString
public class ArticleResponse {
    private Long articleId;
    private String title;
    private String content;
    private Long boardId;
    private Long writerId;
    private LocalDate createdAt;
    private LocalDate modifiedAt;

    public static ArticleResponse from(Article article) {
        ArticleResponse response = new ArticleResponse();
        response.articleId = article.getArticleId();
        response.title = article.getTitle();
        response.content = article.getContent();
        response.boardId = article.getBoardId();
        response.writerId = article.getWriteId();
        response.createdAt = article.getCreateAt();
        response.modifiedAt = article.getModifiedAt();
        return response;
    }
}
