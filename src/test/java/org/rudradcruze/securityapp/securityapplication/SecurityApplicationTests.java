package org.rudradcruze.securityapp.securityapplication;

import org.junit.jupiter.api.Test;
import org.rudradcruze.securityapp.securityapplication.entities.User;
import org.rudradcruze.securityapp.securityapplication.services.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SecurityAppApplicationTests {

    @Autowired
    private JwtService jwtService;

    @Test
    void contextLoads() {

        User user = new User(4L, "rudra@gmail.com", "1234");

        String token = jwtService.generateToken(user);

        System.out.println(token);

//        Long id = jwtService.getUserIdFromToken(token);
        Long id = jwtService.getUserIdFromToken("eyJhbGciOiJIUzUxMiJ9" + ".eyJzdWIiOiI0IiwiZW1haWwiOiJydWRyYUBnbWFpbC5jb20iLCJyb2xlcyI6WyJVU0VSIiwiQURNSU4iXSwiaWF0IjoxNzIzMTA1MjQ0LCJleHAiOjE3MjMxMDUzMDR9" + ".P7SvROHAHkyT-4RqWlXqyYGoc_fT2OFsZNluYnWMreyERRSCWPBnvw3AEW8buHzfGGTgVsE3FRhMPQhbkv-sZA");

        System.out.println(id);

    }

}
