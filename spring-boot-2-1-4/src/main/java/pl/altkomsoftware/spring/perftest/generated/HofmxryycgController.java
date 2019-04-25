package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HofmxryycgController {

    private final HofmxryycgService hofmxryycgService;

    public HofmxryycgController(HofmxryycgService hofmxryycgService) {
        this.hofmxryycgService = hofmxryycgService;
    }

    @RequestMapping("/hofmxryycg")
    public String index() {
        return hofmxryycgService.getGreeting();
    }

}
