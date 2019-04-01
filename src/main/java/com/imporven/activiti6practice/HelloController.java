package com.imporven.activiti6practice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author imporven
 * @version 1.0.0
 * @date 2019-3-29 0:02
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    protected String hello()  {
        return "helloworld";
    }
}
