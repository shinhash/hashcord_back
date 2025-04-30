package dev.hash.hashcord.sign.service;

import java.util.Map;

public interface SignService {

    /**
     * 로그인
     * @param params
     * @param resultData
     * @return
     */
    public Map<String, Object> signIn(Map<String, Object> params, Map<String, Object> resultData);

    /**
     * 회원가입
     * @param params
     * @param resultData
     * @return
     */
    public Map<String, Object> signUp(Map<String, Object> params, Map<String, Object> resultData);

    /**
     * 로그아웃
     * @param params
     * @param resultData
     */
    public void signOut(Map<String, Object> params, Map<String, Object> resultData);
}
