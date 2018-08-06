package pl.com.sk.newspot.article;

import lombok.Data;

@Data
public class ArticleDTO {
    String author;
    String title;
    String description;
    String date;
    String sourceName;
    String articleUrl;
    String imageUrl;
}
