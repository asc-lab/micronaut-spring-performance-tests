package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class LsjstvsiqgController {

    private final LsjstvsiqgService lsjstvsiqgService;

    public LsjstvsiqgController(LsjstvsiqgService lsjstvsiqgService) {
        this.lsjstvsiqgService = lsjstvsiqgService;
    }

    @RequestMapping("/lsjstvsiqg")
    public String index() {
        return lsjstvsiqgService.getGreeting();
    }

}
