package pl.com.sk.newspot.news;

import org.mapstruct.Mapper;
import pl.com.sk.newspot.article.ArticleMapper;

@Mapper(componentModel = "spring", uses = {ArticleMapper.class})
public interface NewsMapper {
    NewsDTO newsToNewsDTO(News news);

}
