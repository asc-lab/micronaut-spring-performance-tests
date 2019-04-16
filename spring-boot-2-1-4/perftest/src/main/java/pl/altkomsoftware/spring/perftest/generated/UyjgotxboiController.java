package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class UyjgotxboiController {

    private final UyjgotxboiService uyjgotxboiService;

    public UyjgotxboiController(UyjgotxboiService uyjgotxboiService) {
        this.uyjgotxboiService = uyjgotxboiService;
    }

    @RequestMapping("/uyjgotxboi")
    public String index() {
        return uyjgotxboiService.getGreeting();
    }

}
