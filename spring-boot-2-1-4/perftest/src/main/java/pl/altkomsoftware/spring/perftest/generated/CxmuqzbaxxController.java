package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CxmuqzbaxxController {

    private final CxmuqzbaxxService cxmuqzbaxxService;

    public CxmuqzbaxxController(CxmuqzbaxxService cxmuqzbaxxService) {
        this.cxmuqzbaxxService = cxmuqzbaxxService;
    }

    @RequestMapping("/cxmuqzbaxx")
    public String index() {
        return cxmuqzbaxxService.getGreeting();
    }

}
