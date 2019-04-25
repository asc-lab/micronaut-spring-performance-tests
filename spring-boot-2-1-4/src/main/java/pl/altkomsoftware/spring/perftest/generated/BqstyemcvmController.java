package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class BqstyemcvmController {

    private final BqstyemcvmService bqstyemcvmService;

    public BqstyemcvmController(BqstyemcvmService bqstyemcvmService) {
        this.bqstyemcvmService = bqstyemcvmService;
    }

    @RequestMapping("/bqstyemcvm")
    public String index() {
        return bqstyemcvmService.getGreeting();
    }

}
