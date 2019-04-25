package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class KaxrnsdzxaController {

    private final KaxrnsdzxaService kaxrnsdzxaService;

    public KaxrnsdzxaController(KaxrnsdzxaService kaxrnsdzxaService) {
        this.kaxrnsdzxaService = kaxrnsdzxaService;
    }

    @RequestMapping("/kaxrnsdzxa")
    public String index() {
        return kaxrnsdzxaService.getGreeting();
    }

}
