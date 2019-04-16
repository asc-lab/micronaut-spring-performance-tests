package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HqvbypgjuhController {

    private final HqvbypgjuhService hqvbypgjuhService;

    public HqvbypgjuhController(HqvbypgjuhService hqvbypgjuhService) {
        this.hqvbypgjuhService = hqvbypgjuhService;
    }

    @RequestMapping("/hqvbypgjuh")
    public String index() {
        return hqvbypgjuhService.getGreeting();
    }

}
