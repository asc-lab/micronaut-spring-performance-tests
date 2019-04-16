package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DuzajlsnbjController {

    private final DuzajlsnbjService duzajlsnbjService;

    public DuzajlsnbjController(DuzajlsnbjService duzajlsnbjService) {
        this.duzajlsnbjService = duzajlsnbjService;
    }

    @RequestMapping("/duzajlsnbj")
    public String index() {
        return duzajlsnbjService.getGreeting();
    }

}
