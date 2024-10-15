package io.bayrktlihn.springresttemplateexample.dto.command;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UpdatePostCommand {

    private Long id;
    private String title;
    private String body;
    private Long userId;

}
