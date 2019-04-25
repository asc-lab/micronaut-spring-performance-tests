package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class AuuzarmicsController {

    private final AuuzarmicsService auuzarmicsService;

    public AuuzarmicsController(AuuzarmicsService auuzarmicsService) {
        this.auuzarmicsService = auuzarmicsService;
    }

    @RequestMapping("/auuzarmics")
    public String index() {
        return auuzarmicsService.getGreeting();
    }

}
