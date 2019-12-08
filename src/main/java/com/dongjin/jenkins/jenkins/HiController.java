package com.dongjin.jenkins.jenkins;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
	
	@RequestMapping(value = "/hello")
    public String hi() {
        return "hello yaohj ";  // 返回端口号，方便负载均衡功能测试，haoceshi
    }
    // 追加注释
}
