package io.bayrktlihn.springresttemplateexample.dto.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class TodoResponse {
    private Long userId;
    private Long id;
    private String title;
    private boolean completed;
}
