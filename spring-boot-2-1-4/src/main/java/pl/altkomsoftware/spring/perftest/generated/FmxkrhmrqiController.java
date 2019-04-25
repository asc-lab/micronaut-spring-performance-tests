package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class FmxkrhmrqiController {

    private final FmxkrhmrqiService fmxkrhmrqiService;

    public FmxkrhmrqiController(FmxkrhmrqiService fmxkrhmrqiService) {
        this.fmxkrhmrqiService = fmxkrhmrqiService;
    }

    @RequestMapping("/fmxkrhmrqi")
    public String index() {
        return fmxkrhmrqiService.getGreeting();
    }

}
