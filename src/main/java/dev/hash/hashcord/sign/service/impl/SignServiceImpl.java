package dev.hash.hashcord.sign.service.impl;

import dev.hash.hashcord.sign.mapper.SignMapper;
import dev.hash.hashcord.sign.service.SignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class SignServiceImpl implements SignService {

    @Autowired
    private SignMapper signMapper;

    /**
     * 로그인
     * @param params
     * @return
     */
    @Override
    public Map<String, Object> signIn(Map<String, Object> params, Map<String, Object> resultData) {
        Map<String, Object> userInfo = signMapper.selectUserInfo(params);
        String errorCode = "";
        String errorDetail = "";

        if(userInfo != null){
            String userPw = (String) userInfo.get("userPw");
            if(userPw.equals(params.get("userPw"))){
                // 세션 로그인 처리

            }else{
                errorCode = "SIGN_IN_ERROR-002";
                errorDetail = "비밀번호 불일치";
            }
        }else{
            errorCode = "SIGN_IN_ERROR-001";
            errorDetail = "아이디 없음";
        }

        resultData.put("resultData", userInfo);
        resultData.put("errorCode", errorCode);
        resultData.put("errorDetail", errorDetail);
        return resultData;
    }

    /**
     * 회원가입
     * @param params
     * @return
     */
    @Override
    public Map<String, Object> signUp(Map<String, Object> params, Map<String, Object> resultData) {
        String resultCode = "";
        String errorCode = "";
        String errorDetail = "";

        // 입력정보 validation check
        try{
            signMapper.insertUserInfo(params);
            resultCode = "SUCCESS";
        }catch(Exception exception){
            resultCode = "FAIL";
            errorCode = "SIGN_UP_ERROR-001";
            errorDetail = "회원가입 실패";
        }

        resultData.put("resultData", resultCode);
        resultData.put("errorCode", errorCode);
        resultData.put("errorDetail", errorDetail);
        return resultData;
    }

    /**
     * 로그아웃
     * @param params
     */
    @Override
    public void signOut(Map<String, Object> params, Map<String, Object> resultData) {

    }
}
