package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class UtfiyrevtyController {

    private final UtfiyrevtyService utfiyrevtyService;

    public UtfiyrevtyController(UtfiyrevtyService utfiyrevtyService) {
        this.utfiyrevtyService = utfiyrevtyService;
    }

    @RequestMapping("/utfiyrevty")
    public String index() {
        return utfiyrevtyService.getGreeting();
    }

}
