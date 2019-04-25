package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class YxanzelubuController {

    private final YxanzelubuService yxanzelubuService;

    public YxanzelubuController(YxanzelubuService yxanzelubuService) {
        this.yxanzelubuService = yxanzelubuService;
    }

    @RequestMapping("/yxanzelubu")
    public String index() {
        return yxanzelubuService.getGreeting();
    }

}
