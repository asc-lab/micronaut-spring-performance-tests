package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HtgygjmstdController {

    private final HtgygjmstdService htgygjmstdService;

    public HtgygjmstdController(HtgygjmstdService htgygjmstdService) {
        this.htgygjmstdService = htgygjmstdService;
    }

    @RequestMapping("/htgygjmstd")
    public String index() {
        return htgygjmstdService.getGreeting();
    }

}
