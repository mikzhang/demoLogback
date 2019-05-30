package com.ran.demo.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/test")
    @ResponseBody
    public String login(){
        //日志级别从低到高分为TRACE < DEBUG < INFO < WARN < ERROR < FATAL，如果设置为WARN，则低于WARN的信息都不会输出。
        logger.trace("日志输出 TRACE");
        logger.debug("日志输出 DEBUG");
        logger.info("日志输出 INFO");
        logger.warn("日志输出 WARN");
        logger.error("日志输出 ERROR");
        return "OK";
    }
}
