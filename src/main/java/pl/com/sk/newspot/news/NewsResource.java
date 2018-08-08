package pl.com.sk.newspot.news;

import io.swagger.annotations.ApiOperation;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RequiredArgsConstructor
@RequestMapping(value = "api/news")
@RestController
public class NewsResource {

   @NonNull
   private NewsService newsService;

    @ApiOperation(value = "Get news from specified Country and technology")
    @GetMapping
    public NewsDTO getAllNews(@RequestParam("country") String country, @RequestParam("category") String category,
                              @RequestParam("page") Integer page, @RequestParam("pageSize") Integer pageSize){
        return newsService.getNewsByCountryAndCategory(country,category,page,pageSize);
    }
}
