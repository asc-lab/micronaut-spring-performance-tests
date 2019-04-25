package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DaiwbfnwcdController {

    private final DaiwbfnwcdService daiwbfnwcdService;

    public DaiwbfnwcdController(DaiwbfnwcdService daiwbfnwcdService) {
        this.daiwbfnwcdService = daiwbfnwcdService;
    }

    @RequestMapping("/daiwbfnwcd")
    public String index() {
        return daiwbfnwcdService.getGreeting();
    }

}
