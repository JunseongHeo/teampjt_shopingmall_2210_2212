package common.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;


@RestController
public class TestController {

    @GetMapping("/test")
    public String getTest() {

        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");

        return formatter.format(date) + " test 페이지 출력1";
    }
}
