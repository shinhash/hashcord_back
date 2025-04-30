package dev.hash.hashcord.sign.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface SignMapper {

    /**
     * 회원정보 조회
     * @param params
     * @return
     */
    public Map<String, Object> selectUserInfo(Map<String, Object> params);

    /**
     * 회원정보 등록
     * @param params
     */
    public void insertUserInfo(Map<String, Object> params);
}
