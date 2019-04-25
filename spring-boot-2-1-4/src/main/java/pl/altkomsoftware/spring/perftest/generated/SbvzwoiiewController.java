package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SbvzwoiiewController {

    private final SbvzwoiiewService sbvzwoiiewService;

    public SbvzwoiiewController(SbvzwoiiewService sbvzwoiiewService) {
        this.sbvzwoiiewService = sbvzwoiiewService;
    }

    @RequestMapping("/sbvzwoiiew")
    public String index() {
        return sbvzwoiiewService.getGreeting();
    }

}
