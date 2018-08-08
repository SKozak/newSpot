package pl.com.sk.newspot.news;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.com.sk.newspot.newsclient.NewsApiClient;

@RequiredArgsConstructor
@Service
class NewsServiceImpl implements NewsService {

    @NonNull
    private NewsApiClient newsApiClient;

    @NonNull
    private NewsMapper newsMapper;


    @Override
    public NewsDTO getNewsByCountryAndCategory(String country, String category, Integer page, Integer pageSize) {
        News newsByCountryAndCategory = newsApiClient.getNewsByCountryAndCategory(country, category, page, pageSize);
        return NewsDTO.builder()
                .articles(newsMapper.newsToNewsDTO(newsByCountryAndCategory).getArticles())
                .totalResults(newsByCountryAndCategory.getTotalResults())
                .category(category)
                .country(country)
                .build();
    }
}
