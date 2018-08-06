package pl.com.sk.newspot.news;

import lombok.Data;
import pl.com.sk.newspot.article.Article;

import java.util.List;

@Data
public class News {
    String status;
    int totalResults;
    List<Article> articles;
}
