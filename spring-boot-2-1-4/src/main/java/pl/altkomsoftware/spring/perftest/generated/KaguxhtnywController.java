package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class KaguxhtnywController {

    private final KaguxhtnywService kaguxhtnywService;

    public KaguxhtnywController(KaguxhtnywService kaguxhtnywService) {
        this.kaguxhtnywService = kaguxhtnywService;
    }

    @RequestMapping("/kaguxhtnyw")
    public String index() {
        return kaguxhtnywService.getGreeting();
    }

}
