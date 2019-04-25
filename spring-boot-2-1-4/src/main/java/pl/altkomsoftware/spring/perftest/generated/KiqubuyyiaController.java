package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class KiqubuyyiaController {

    private final KiqubuyyiaService kiqubuyyiaService;

    public KiqubuyyiaController(KiqubuyyiaService kiqubuyyiaService) {
        this.kiqubuyyiaService = kiqubuyyiaService;
    }

    @RequestMapping("/kiqubuyyia")
    public String index() {
        return kiqubuyyiaService.getGreeting();
    }

}
