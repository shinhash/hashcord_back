package dev.hash.hashcord.sign.web;

import dev.hash.hashcord.sign.service.SignService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RequestMapping("/hashcord/sign")
@RestController
public class SignController {

    @Autowired
    private SignService signService;

    @RequestMapping("/signIn")
    public Map<String, Object> signIn(@RequestBody Map<String, Object> params, HttpServletRequest request){
        Map<String, Object> resultData = new HashMap<String, Object>();
        signService.signIn(params, resultData);
        return resultData;
    }

    @RequestMapping("/signUp")
    public Map<String, Object> signUp(@RequestBody Map<String, Object> params, HttpServletRequest request){
        Map<String, Object> resultData = new HashMap<String, Object>();
        signService.signUp(params, resultData);
        return resultData;
    }

    @RequestMapping("/signOut")
    public Map<String, Object> signOut(@RequestBody Map<String, Object> params, HttpServletRequest request){
        Map<String, Object> resultData = new HashMap<String, Object>();
        signService.signOut(params, resultData);
        return resultData;
    }
}
