package pl.com.sk.newspot.newsclient;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pl.com.sk.newspot.app.config.FeignDecoderConfig;
import pl.com.sk.newspot.news.News;
import pl.com.sk.newspot.source.SourceResponse;

@FeignClient(name = "Country-service-client", url = "https://newsapi.org/v2", configuration = FeignDecoderConfig.class)
public interface NewsApiClient {

    @RequestMapping(method = RequestMethod.GET, value = "top-headlines")
    News getNewsByCountryAndCategory(@RequestParam("Country") String country, @RequestParam("category") String category,
                                     @RequestParam("page") Integer page, @RequestParam("pageSize") Integer pageSize);

    @RequestMapping(method = RequestMethod.GET, value = "sources")
    SourceResponse getSources();


}

