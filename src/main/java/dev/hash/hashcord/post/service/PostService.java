package dev.hash.hashcord.post.service;

import java.util.List;
import java.util.Map;

public interface PostService {

    /**
     * 게시글 목록조회
     * @param params
     * @return
     */
    public Map<String, Object> selectPostList(Map<String, Object> params, Map<String, Object> resultData);

    /**
     * 게시글 상세조회
     * @param params
     * @return
     */
    public Map<String, Object> selectPostDetail(Map<String, Object> params, Map<String, Object> resultData);
}
