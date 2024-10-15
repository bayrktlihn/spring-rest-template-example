package io.bayrktlihn.springresttemplateexample.client;

import io.bayrktlihn.springresttemplateexample.dto.command.CreatePostCommand;
import io.bayrktlihn.springresttemplateexample.dto.command.UpdatePostCommand;
import io.bayrktlihn.springresttemplateexample.dto.response.*;
import io.bayrktlihn.springresttemplateexample.interceptor.LoggingRequestInterceptor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;

public class JsonPlaceHolderClient {


    private static final String baseUrl = "https://jsonplaceholder.typicode.com/";

    private final RestTemplate restTemplate = new RestTemplate(new BufferingClientHttpRequestFactory(new SimpleClientHttpRequestFactory()));


    {
        List<ClientHttpRequestInterceptor> interceptors = restTemplate.getInterceptors();

        interceptors.add(new LoggingRequestInterceptor());
    }


    public UpdatePostResponse updatePost(Long postId, UpdatePostCommand updatePostCommand){
        String requestUrl = baseUrl + "/posts/{id}";

        HttpHeaders headers = new HttpHeaders();
        headers.add("Accept", "application/json");
        headers.add("Content-Type", "application/json");

        HttpEntity<UpdatePostCommand> requestEntity = new HttpEntity<>(updatePostCommand, headers);
        HashMap<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("id", postId);

        ResponseEntity<UpdatePostResponse> result = restTemplate.exchange(requestUrl, HttpMethod.PUT, requestEntity, UpdatePostResponse.class, uriVariables);

        return result.getBody();
    }



    public CreatePostResponse createPost(CreatePostCommand createPostCommand) {
        String requestUrl = baseUrl + "/posts";

        HttpHeaders headers = new HttpHeaders();
        headers.add("Accept", "application/json");
        headers.add("Content-Type", "application/json");

        HttpEntity<CreatePostCommand> requestEntity = new HttpEntity<>(createPostCommand, headers);
        HashMap<String, Object> uriVariables = new HashMap<>();

        ResponseEntity<CreatePostResponse> result = restTemplate.exchange(requestUrl, HttpMethod.POST, requestEntity, CreatePostResponse.class, uriVariables);

        return result.getBody();


    }

    public List<CommentResponse> comments() {
        String requestUrl = baseUrl + "/comments";

        HttpHeaders headers = new HttpHeaders();
        headers.add("Accept", "application/json");
        headers.add("Content-Type", "application/json");

        HttpEntity<?> requestEntity = new HttpEntity<>(headers);
        HashMap<String, Object> uriVariables = new HashMap<>();

        ResponseEntity<List<CommentResponse>> result = restTemplate.exchange(requestUrl, HttpMethod.GET, requestEntity, new ParameterizedTypeReference<>() {
        }, uriVariables);


        return result.getBody();
    }

    public List<TodoResponse> todos() {


        String requestUrl = baseUrl + "/todos";

        HttpHeaders headers = new HttpHeaders();
        headers.add("Accept", "application/json");
        headers.add("Content-Type", "application/json");


        HttpEntity<?> requestEntity = new HttpEntity<>(headers);
        HashMap<String, Object> uriVariables = new HashMap<>();


        ResponseEntity<List<TodoResponse>> result = restTemplate.exchange(requestUrl, HttpMethod.GET, requestEntity, new ParameterizedTypeReference<>() {
        }, uriVariables);


        return result.getBody();

    }

    public List<PostResponse> posts() {
        String requestUrl = baseUrl + "/todos";

        HttpHeaders headers = new HttpHeaders();
        headers.add("Accept", "application/json");
        headers.add("Content-Type", "application/json");


        HttpEntity<?> requestEntity = new HttpEntity<>(headers);
        HashMap<String, Object> uriVariables = new HashMap<>();


        ResponseEntity<List<PostResponse>> result = restTemplate.exchange(requestUrl, HttpMethod.GET, requestEntity, new ParameterizedTypeReference<>() {
        }, uriVariables);


        return result.getBody();
    }

    public List<CommentResponse> commentsOfPost(Long postId) {
        String requestUrl = baseUrl + "/posts/{id}/comments";

        HttpHeaders headers = new HttpHeaders();
        headers.add("Accept", "application/json");
        headers.add("Content-Type", "application/json");


        HttpEntity<?> requestEntity = new HttpEntity<>(headers);
        HashMap<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("id", postId);

        ResponseEntity<List<CommentResponse>> result = restTemplate.exchange(requestUrl, HttpMethod.GET, requestEntity, new ParameterizedTypeReference<>() {
        }, uriVariables);


        return result.getBody();
    }


}
