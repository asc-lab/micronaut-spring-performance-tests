package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HqgqvhmzlcController {

    private final HqgqvhmzlcService hqgqvhmzlcService;

    public HqgqvhmzlcController(HqgqvhmzlcService hqgqvhmzlcService) {
        this.hqgqvhmzlcService = hqgqvhmzlcService;
    }

    @RequestMapping("/hqgqvhmzlc")
    public String index() {
        return hqgqvhmzlcService.getGreeting();
    }

}
