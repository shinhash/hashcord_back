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
    
    /**
     * 채널 카테고리 목록조회
     * @param params
     * @param request
     * @return
     */
    @PostMapping("/selectChanelCategoryList")
    public Map<String, Object> selectChanelCategoryList(@RequestBody Map<String, Object> params, HttpServletRequest request) {
        Map<String, Object> resultData = new HashMap<String, Object>();
        postService.selectChanelCategoryList(params, resultData);
        return resultData;
    }

    /**
     * 게시글 목록조회
     * @param params
     * @param request
     * @return
     */
    @PostMapping("/selectPostList")
    public Map<String, Object> selectPostList(@RequestBody Map<String, Object> params, HttpServletRequest request) {
        Map<String, Object> resultData = new HashMap<String, Object>();
        postService.selectPostList(params, resultData);
        return resultData;
    }

    /**
     * 게시글 상세조회
     * @param params
     * @param request
     * @return
     */
    @PostMapping("/selectPostDetail")
    public Map<String, Object> selectPostDetail(@RequestBody Map<String, Object> params, HttpServletRequest request) {
        Map<String, Object> resultData = new HashMap<String, Object>();
        postService.selectPostDetail(params, resultData);
        return resultData;
    }
}
