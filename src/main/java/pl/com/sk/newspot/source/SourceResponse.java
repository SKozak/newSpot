package pl.com.sk.newspot.source;

import lombok.Data;

import java.util.List;

@Data
public class SourceResponse {
    String status;
    List<Source> sources;
}
