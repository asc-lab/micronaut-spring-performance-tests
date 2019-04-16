package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ClngqdyecxController {

    private final ClngqdyecxService clngqdyecxService;

    public ClngqdyecxController(ClngqdyecxService clngqdyecxService) {
        this.clngqdyecxService = clngqdyecxService;
    }

    @RequestMapping("/clngqdyecx")
    public String index() {
        return clngqdyecxService.getGreeting();
    }

}
