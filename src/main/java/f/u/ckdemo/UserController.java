package f.u.ckdemo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@RequestMapping(value = "/a")
public class UserController {
    @RequestMapping(value = "/b", method = RequestMethod.GET)
    String getUserByGet() {
        System.out.println("进来了");
        return "hello world";
    }
}