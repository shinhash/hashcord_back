package dev.hash.hashcord.post.service.impl;

import dev.hash.hashcord.post.mapper.PostMapper;
import dev.hash.hashcord.post.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostMapper postMapper;

    @Override
    public Map<String, Object> selectPostList(Map<String, Object> params, Map<String, Object> resultData) {
        List<Map<String, Object>> postList = new ArrayList<Map<String, Object>>();
        String errorCode = "";
        String errorDetail = "";

        try{
            postList = postMapper.selectPostList(params);
        }catch(Exception exception){
            errorCode = "POST_LIST_ERROR-001";
            errorDetail = "게시글 목록 조회 실패";
        }

        resultData.put("resultData", postList);
        resultData.put("errorCode", errorCode);
        resultData.put("errorDetail", errorDetail);
        return resultData;
    }

    @Override
    public Map<String, Object> selectPostDetail(Map<String, Object> params, Map<String, Object> resultData) {
        Map<String, Object> postDetail = new HashMap<String, Object>();
        String errorCode = "";
        String errorDetail = "";

        try{
            postDetail = postMapper.selectPostDetail(params);
        }catch(Exception exception){
            errorCode = "POST_DETAIL_ERROR-001";
            errorDetail = "게시글 상세 조회 실패";
        }

        resultData.put("resultData", postDetail);
        resultData.put("errorCode", errorCode);
        resultData.put("errorDetail", errorDetail);
        return resultData;
    }
}
