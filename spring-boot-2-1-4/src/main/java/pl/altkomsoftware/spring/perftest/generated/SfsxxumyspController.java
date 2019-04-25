package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SfsxxumyspController {

    private final SfsxxumyspService sfsxxumyspService;

    public SfsxxumyspController(SfsxxumyspService sfsxxumyspService) {
        this.sfsxxumyspService = sfsxxumyspService;
    }

    @RequestMapping("/sfsxxumysp")
    public String index() {
        return sfsxxumyspService.getGreeting();
    }

}
