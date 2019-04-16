package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class WxuhzjhkvlController {

    private final WxuhzjhkvlService wxuhzjhkvlService;

    public WxuhzjhkvlController(WxuhzjhkvlService wxuhzjhkvlService) {
        this.wxuhzjhkvlService = wxuhzjhkvlService;
    }

    @RequestMapping("/wxuhzjhkvl")
    public String index() {
        return wxuhzjhkvlService.getGreeting();
    }

}
