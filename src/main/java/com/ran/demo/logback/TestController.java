package com.ran.demo.logback;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
public class TestController {

    //lombok 的 @Slf4j 替代之
//    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/test")
    @ResponseBody
    public String login(){
        //日志级别从低到高分为TRACE < DEBUG < INFO < WARN < ERROR < FATAL，如果设置为WARN，则低于WARN的信息都不会输出。
        log.trace("日志输出 TRACE");
        log.debug("日志输出 DEBUG");
        log.info("日志输出 INFO");
        log.warn("日志输出 WARN");
        log.error("日志输出 ERROR");
        return "OK";
    }
}
