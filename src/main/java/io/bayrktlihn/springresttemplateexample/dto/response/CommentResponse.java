package io.bayrktlihn.springresttemplateexample.dto.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CommentResponse {
    private Long id;
    private Long postId;
    private String email;
    private String body;
    private String name;
}
