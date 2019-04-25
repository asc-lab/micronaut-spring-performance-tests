package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class PsjmjxxbhcController {

    private final PsjmjxxbhcService psjmjxxbhcService;

    public PsjmjxxbhcController(PsjmjxxbhcService psjmjxxbhcService) {
        this.psjmjxxbhcService = psjmjxxbhcService;
    }

    @RequestMapping("/psjmjxxbhc")
    public String index() {
        return psjmjxxbhcService.getGreeting();
    }

}
