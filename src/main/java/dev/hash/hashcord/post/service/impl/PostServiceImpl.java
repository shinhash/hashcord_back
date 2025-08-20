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
    
    /**
     * 채널 구독자 수 조회
     */
    @Override
	public Map<String, Object> selectChanelSubScribCnt(Map<String, Object> params, Map<String, Object> resultData) {
    	int chanelSubScribCnt = 0;
        String errorCode = "";
        String errorDetail = "";

        try{
        	chanelSubScribCnt = postMapper.selectChanelSubScribCnt(params);
        }catch(Exception exception){
            errorCode = "CHANEL_SUBSCRIB_CNT_ERROR-001";
            errorDetail = "채널 구독자 수 조회 실패";
        }

        resultData.put("resultData", chanelSubScribCnt);
        resultData.put("errorCode", errorCode);
        resultData.put("errorDetail", errorDetail);
        return resultData;
	}
    
    /**
     * 채널 카테고리 목록조회
     */
    @Override
	public Map<String, Object> selectChanelCategoryList(Map<String, Object> params, Map<String, Object> resultData) {
    	List<Map<String, Object>> chanelCategoryList = new ArrayList<Map<String, Object>>();
        String errorCode = "";
        String errorDetail = "";

        try{
        	chanelCategoryList = postMapper.selectChanelCategoryList(params);
        }catch(Exception exception){
            errorCode = "CHANEL_CATEGORY_LIST_ERROR-001";
            errorDetail = "채널 카테고리 목록 조회 실패";
        }

        resultData.put("resultData", chanelCategoryList);
        resultData.put("errorCode", errorCode);
        resultData.put("errorDetail", errorDetail);
        return resultData;
	}

    /**
     * 게시글 목록조회
     */
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

    /**
     * 게시글 상세조회
     */
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
