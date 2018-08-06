package pl.com.sk.newspot.news;

import io.swagger.annotations.ApiOperation;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequiredArgsConstructor
@RequestMapping(value = "news")
@RestController
public class NewsResource {

   @NonNull
   private NewsService newsService;

    @ApiOperation(value = "Get news from specified Country and technology")
    @GetMapping
    public NewsDTO getAllNews(){
        return newsService.getNewsByCountryAndCategory("pl","technology");
    }
}
