package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SyjxrnxanqController {

    private final SyjxrnxanqService syjxrnxanqService;

    public SyjxrnxanqController(SyjxrnxanqService syjxrnxanqService) {
        this.syjxrnxanqService = syjxrnxanqService;
    }

    @RequestMapping("/syjxrnxanq")
    public String index() {
        return syjxrnxanqService.getGreeting();
    }

}
