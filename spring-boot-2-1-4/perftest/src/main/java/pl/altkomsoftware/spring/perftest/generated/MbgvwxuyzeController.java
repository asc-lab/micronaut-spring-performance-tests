package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MbgvwxuyzeController {

    private final MbgvwxuyzeService mbgvwxuyzeService;

    public MbgvwxuyzeController(MbgvwxuyzeService mbgvwxuyzeService) {
        this.mbgvwxuyzeService = mbgvwxuyzeService;
    }

    @RequestMapping("/mbgvwxuyze")
    public String index() {
        return mbgvwxuyzeService.getGreeting();
    }

}
