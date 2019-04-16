package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class YfrwwfewuyController {

    private final YfrwwfewuyService yfrwwfewuyService;

    public YfrwwfewuyController(YfrwwfewuyService yfrwwfewuyService) {
        this.yfrwwfewuyService = yfrwwfewuyService;
    }

    @RequestMapping("/yfrwwfewuy")
    public String index() {
        return yfrwwfewuyService.getGreeting();
    }

}
