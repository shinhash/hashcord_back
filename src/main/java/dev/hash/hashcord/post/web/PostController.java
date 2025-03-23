package dev.hash.hashcord.post.web;

import dev.hash.hashcord.post.service.PostService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/hashcord/post")
public class PostController {

    @Autowired
    private PostService postService;

    @PostMapping("/selectPostList")
    public Map<String, Object> selectPostList(@RequestBody Map<String, Object> params, HttpServletRequest request) {
        Map<String, Object> resultData = new HashMap<String, Object>();
        postService.selectPostList(params, resultData);
        return resultData;
    }

    @PostMapping("/selectPostDetail")
    public Map<String, Object> selectPostDetail(@RequestBody Map<String, Object> params, HttpServletRequest request) {
        Map<String, Object> resultData = new HashMap<String, Object>();
        postService.selectPostDetail(params, resultData);
        return resultData;
    }
}
