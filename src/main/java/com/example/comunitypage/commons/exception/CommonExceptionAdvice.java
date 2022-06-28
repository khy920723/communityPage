package com.example.comunitypage.commons.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

// 예외처리를 위한 클래스
// 개발 시에만 사용하는 것을 권장
@ControllerAdvice
public class CommonExceptionAdvice {

    private static final Logger logger = LoggerFactory.getLogger(CommonExceptionAdvice.class);

//    ModelAndView 타입: 하나의 객체로 Model 데이터와 View를 동시에 처리 가능한 객체
    @ExceptionHandler(Exception.class)
    public ModelAndView commonException(Exception e){

        logger.info(e.toString());
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("exception", e);
        modelAndView.setViewName("/commons/common_error");

        return modelAndView;
    }
}
