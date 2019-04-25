package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CxlqpzlrfzController {

    private final CxlqpzlrfzService cxlqpzlrfzService;

    public CxlqpzlrfzController(CxlqpzlrfzService cxlqpzlrfzService) {
        this.cxlqpzlrfzService = cxlqpzlrfzService;
    }

    @RequestMapping("/cxlqpzlrfz")
    public String index() {
        return cxlqpzlrfzService.getGreeting();
    }

}
