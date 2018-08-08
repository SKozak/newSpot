package pl.com.sk.newspot.source;

import io.swagger.annotations.ApiOperation;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequiredArgsConstructor
@RequestMapping(value = "api/sources")
@RestController
public class SourceResource {

    @NonNull
    private SourceService sourceService;

    @ApiOperation(value = "Get all categories from sources")
    @GetMapping("categories")
    public List<String> getCategoriesFromSources(){
        return sourceService.getCategoriesFromSources();
    }
}
