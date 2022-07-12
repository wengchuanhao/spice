package dgb.spice.spice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author GentleKiller
 * @date Created in 2022/7/12 1:05
 * @description 测试接口
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String test(){
        return "welcome";
    }
}
