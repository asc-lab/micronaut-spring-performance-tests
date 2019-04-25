package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class OuhuclwyeyController {

    private final OuhuclwyeyService ouhuclwyeyService;

    public OuhuclwyeyController(OuhuclwyeyService ouhuclwyeyService) {
        this.ouhuclwyeyService = ouhuclwyeyService;
    }

    @RequestMapping("/ouhuclwyey")
    public String index() {
        return ouhuclwyeyService.getGreeting();
    }

}
