package io.bayrktlihn.springresttemplateexample.client;

import io.bayrktlihn.springresttemplateexample.dto.command.CreatePostCommand;
import io.bayrktlihn.springresttemplateexample.dto.command.UpdatePostCommand;
import io.bayrktlihn.springresttemplateexample.dto.response.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.List;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class JsonPlaceHolderClientTest {


    private JsonPlaceHolderClient jsonPlaceHolderClient;

    @BeforeAll
    void setUp() {
        jsonPlaceHolderClient = new JsonPlaceHolderClient();
    }



    @Test
    void todos() {
        List<TodoResponse> todos = jsonPlaceHolderClient.todos();


        System.out.println(todos);
    }

    @Test
    void comments(){
        List<CommentResponse> comments = jsonPlaceHolderClient.comments();
    }

    @Test
    void createPost(){
        CreatePostCommand createPostCommand = new CreatePostCommand();
        createPostCommand.setBody("test");
        createPostCommand.setTitle("test");
        createPostCommand.setUserId(1L);


        CreatePostResponse post = jsonPlaceHolderClient.createPost(createPostCommand);

    }


    @Test
    void updatePost(){
        UpdatePostCommand updatePostCommand = new UpdatePostCommand();
        updatePostCommand.setId(1L);
        updatePostCommand.setTitle("foo");
        updatePostCommand.setBody("bar");
        updatePostCommand.setUserId(1L);
        UpdatePostResponse post = jsonPlaceHolderClient.updatePost(1L, updatePostCommand);
    }

    @Test
    void posts(){
        List<PostResponse> posts = jsonPlaceHolderClient.posts();
    }

    @Test
    void commentsOfPost(){
        List<CommentResponse> commentResponses = jsonPlaceHolderClient.commentsOfPost(1L);
    }


}