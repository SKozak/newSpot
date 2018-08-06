package pl.com.sk.newspot.news;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.com.sk.newspot.article.ArticleDTO;
import pl.com.sk.newspot.newsclient.NewsApiClient;

import java.util.List;

@RequiredArgsConstructor
@Service
class NewsServiceImpl implements NewsService{

    @NonNull
    private NewsApiClient newsApiClient;

    @NonNull
    private NewsMapper newsMapper;


    @Override
    public NewsDTO getNewsByCountryAndCategory(String country, String category) {
        List<ArticleDTO> articles = newsMapper.newsToNewsDTO(newsApiClient.getNewsByCountryAndCategory(country, category)).getArticles();
        return  NewsDTO.builder()
                .articles(articles)
                .category(category)
                .country(country)
                .build();
    }
}
