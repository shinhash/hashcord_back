package dev.hash.hashcord.post.service;

import java.util.Map;

public interface PostService {
	
	
	/**
	 * 채널 카테고리 목록조회
	 * @param params
	 * @param resultData
	 * @return
	 */
	public Map<String, Object> selectChanelCategoryList(Map<String, Object> params, Map<String, Object> resultData);

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
