package io.bayrktlihn.springresttemplateexample.dto.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UpdatePostResponse {

    private Long id;
    private String title;
    private String body;
    private Long userId;

}
