package io.bayrktlihn.springresttemplateexample.dto.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PostResponse {
    private Long userId;
    private Long id;
    private String title;
    private String body;
}
