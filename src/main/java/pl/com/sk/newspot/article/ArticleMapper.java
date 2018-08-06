package pl.com.sk.newspot.article;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface ArticleMapper {

    @Mappings({
            @Mapping(source = "publishedAt", target = "date", dateFormat = "yyyy-MM-dd"),
            @Mapping(source = "source.name", target = "sourceName"),
            @Mapping(source = "url", target = "articleUrl"),
            @Mapping(source = "urlToImage", target = "imageUrl"),
    })
    ArticleDTO articleToArticleDTO(Article article);

}
