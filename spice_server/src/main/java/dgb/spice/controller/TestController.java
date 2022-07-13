package dgb.spice.controller;

import dgb.spice.common.ApiRestResponse;
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
    public ApiRestResponse<String> test(){
        return ApiRestResponse.success();
    }
}
