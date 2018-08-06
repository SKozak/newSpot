package pl.com.sk.newspot.source;

import lombok.Data;

@Data
public class Source {
    String id;
    String name;
    String description;
    String url;
    String category;
    String language;
    String country;
}
