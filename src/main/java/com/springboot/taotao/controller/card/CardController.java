package com.springboot.taotao.controller.card;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author liqiang
 * @date 2019-04-02 12:59
 * @description
 */
@RestController
public class CardController {

    @RequestMapping(value = "/card")
    public void callBack(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        System.out.println("回调成功");
    }

}
