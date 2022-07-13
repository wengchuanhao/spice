package dgb.spice.controller;

import dgb.spice.common.ApiRestResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author GentleKiller
 * @date Created in 2022/7/13 20:05
 * @description 首页Controller
 */
@RestController
public class IndexController {

    @GetMapping("/country")
    public ApiRestResponse<String> getCountries(){
        return ApiRestResponse.success();
    }
}
