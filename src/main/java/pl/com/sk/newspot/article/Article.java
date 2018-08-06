package pl.com.sk.newspot.article;


import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;
import pl.com.sk.newspot.app.config.LocalDateDeserializer;
import pl.com.sk.newspot.source.Source;

import java.time.LocalDate;

@Data
public class Article {
    Source source;
    String author;
    String title;
    String description;
    String url;
    String urlToImage;
    @JsonDeserialize(using = LocalDateDeserializer.class)
    LocalDate publishedAt;
}
