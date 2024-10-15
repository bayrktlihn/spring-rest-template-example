package io.bayrktlihn.springresttemplateexample.dto.command;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CreatePostCommand {
    private String title;
    private String body;
    private Long userId;

    private CreatePostCommand(Builder builder) {
        setTitle(builder.title);
        setBody(builder.body);
        setUserId(builder.userId);
    }

    public static Builder builder() {
        return new Builder();
    }


    public static final class Builder {
        private String title;
        private String body;
        private Long userId;

        private Builder() {
        }

        public Builder title(String val) {
            title = val;
            return this;
        }

        public Builder body(String val) {
            body = val;
            return this;
        }

        public Builder userId(Long val) {
            userId = val;
            return this;
        }

        public CreatePostCommand build() {
            return new CreatePostCommand(this);
        }
    }
}
