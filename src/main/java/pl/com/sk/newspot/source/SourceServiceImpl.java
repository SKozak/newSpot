package pl.com.sk.newspot.source;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.com.sk.newspot.newsclient.NewsApiClient;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SourceServiceImpl implements SourceService{

    @NonNull
    NewsApiClient newsApiClient;

    @Override
    public List<String> getCategoriesFromSources() {
        return newsApiClient.getSources()
                .getSources()
                .stream()
                .map(Source::getCategory)
                .distinct()
                .collect(Collectors.toList());
    }
}
