package com.dockerforjavadevelopers.hello;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class HelloController {

    @Autowired
    private RestTemplate restTemplate;
    

    @Value("${api.url}")
    private String url;

    @GetMapping("/hello")
    public String hello() {
        String response = restTemplate.getForObject(url, String.class);
        return response;
    }
}
