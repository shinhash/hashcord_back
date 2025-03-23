package dev.hash.hashcord.post.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface PostMapper {

    /**
     * 게시글 목록조회
     * @param params
     * @return
     */
    public List<Map<String, Object>> selectPostList(Map<String, Object> params);

    /**
     * 게시글 상세조회
     * @param params
     * @return
     */
    public Map<String, Object> selectPostDetail(Map<String, Object> params);
}
