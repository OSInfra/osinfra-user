package com.github.osinfra.user.web;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Authorization;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/osinfra/user")
public class TestController {

    @GetMapping("/test")
    @ApiOperation(value = "Hello World", authorizations = {@Authorization(value = "Authorization")})
    public String test() {
        return "Hello World";
    }
}
