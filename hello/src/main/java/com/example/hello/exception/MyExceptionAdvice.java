package com.example.hello.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class MyExceptionAdvice {

    /**
     * 全局捕获异常，只要作用在@RequestMapping上，所有的异常都会被捕获
     * @param ex
     * @return
     */
    @ExceptionHandler(value = BusinessException.class)
    @ResponseBody
    public Map<String, Object> errorHandler(BusinessException ex) {
        Map<String, Object> map = new HashMap<>();
        map.put("code", ex.getCode());
        map.put("msg", ex.getMsg());
        return map;
    }

}
