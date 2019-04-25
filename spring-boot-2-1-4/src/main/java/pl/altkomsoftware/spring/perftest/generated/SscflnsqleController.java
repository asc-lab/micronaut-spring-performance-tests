package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SscflnsqleController {

    private final SscflnsqleService sscflnsqleService;

    public SscflnsqleController(SscflnsqleService sscflnsqleService) {
        this.sscflnsqleService = sscflnsqleService;
    }

    @RequestMapping("/sscflnsqle")
    public String index() {
        return sscflnsqleService.getGreeting();
    }

}
