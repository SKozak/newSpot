package pl.com.sk.newspot.news;

public interface NewsService {

    NewsDTO getNewsByCountryAndCategory(String country, String category);

}
