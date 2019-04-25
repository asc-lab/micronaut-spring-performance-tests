package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class LkhfuemdohController {

    private final LkhfuemdohService lkhfuemdohService;

    public LkhfuemdohController(LkhfuemdohService lkhfuemdohService) {
        this.lkhfuemdohService = lkhfuemdohService;
    }

    @RequestMapping("/lkhfuemdoh")
    public String index() {
        return lkhfuemdohService.getGreeting();
    }

}
