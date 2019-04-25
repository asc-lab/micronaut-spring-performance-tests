package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class WxchjgzxcqController {

    private final WxchjgzxcqService wxchjgzxcqService;

    public WxchjgzxcqController(WxchjgzxcqService wxchjgzxcqService) {
        this.wxchjgzxcqService = wxchjgzxcqService;
    }

    @RequestMapping("/wxchjgzxcq")
    public String index() {
        return wxchjgzxcqService.getGreeting();
    }

}
