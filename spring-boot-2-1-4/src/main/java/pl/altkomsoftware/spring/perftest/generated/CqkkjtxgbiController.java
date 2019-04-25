package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CqkkjtxgbiController {

    private final CqkkjtxgbiService cqkkjtxgbiService;

    public CqkkjtxgbiController(CqkkjtxgbiService cqkkjtxgbiService) {
        this.cqkkjtxgbiService = cqkkjtxgbiService;
    }

    @RequestMapping("/cqkkjtxgbi")
    public String index() {
        return cqkkjtxgbiService.getGreeting();
    }

}
