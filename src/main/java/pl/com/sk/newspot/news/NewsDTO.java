package pl.com.sk.newspot.news;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.com.sk.newspot.article.ArticleDTO;

import java.util.List;



@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NewsDTO {
    String country;
    String category;
    List<ArticleDTO> articles;

}
