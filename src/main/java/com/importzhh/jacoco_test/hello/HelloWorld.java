package com.importzhh.jacoco_test.hello;

import com.importzhh.jacoco_test.user.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

public class HelloWorld {
    @Api(tags = "hello控制类")
    @RestController
    public class helloController {

        @ApiOperation("查找")
        //@ApiParam() 这个是用于参数的注释
        @PostMapping("/test")
        public User test(User user){
            System.out.println(user);
            return user;
        }
    }


}
