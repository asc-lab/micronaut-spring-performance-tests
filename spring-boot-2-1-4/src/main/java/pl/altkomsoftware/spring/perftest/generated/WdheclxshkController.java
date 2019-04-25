package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class WdheclxshkController {

    private final WdheclxshkService wdheclxshkService;

    public WdheclxshkController(WdheclxshkService wdheclxshkService) {
        this.wdheclxshkService = wdheclxshkService;
    }

    @RequestMapping("/wdheclxshk")
    public String index() {
        return wdheclxshkService.getGreeting();
    }

}
