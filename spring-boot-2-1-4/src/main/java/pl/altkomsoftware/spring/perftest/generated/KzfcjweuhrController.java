package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class KzfcjweuhrController {

    private final KzfcjweuhrService kzfcjweuhrService;

    public KzfcjweuhrController(KzfcjweuhrService kzfcjweuhrService) {
        this.kzfcjweuhrService = kzfcjweuhrService;
    }

    @RequestMapping("/kzfcjweuhr")
    public String index() {
        return kzfcjweuhrService.getGreeting();
    }

}
