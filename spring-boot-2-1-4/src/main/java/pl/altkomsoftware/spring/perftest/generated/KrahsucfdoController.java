package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class KrahsucfdoController {

    private final KrahsucfdoService krahsucfdoService;

    public KrahsucfdoController(KrahsucfdoService krahsucfdoService) {
        this.krahsucfdoService = krahsucfdoService;
    }

    @RequestMapping("/krahsucfdo")
    public String index() {
        return krahsucfdoService.getGreeting();
    }

}
