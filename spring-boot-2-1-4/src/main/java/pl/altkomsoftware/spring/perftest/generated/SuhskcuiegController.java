package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SuhskcuiegController {

    private final SuhskcuiegService suhskcuiegService;

    public SuhskcuiegController(SuhskcuiegService suhskcuiegService) {
        this.suhskcuiegService = suhskcuiegService;
    }

    @RequestMapping("/suhskcuieg")
    public String index() {
        return suhskcuiegService.getGreeting();
    }

}
