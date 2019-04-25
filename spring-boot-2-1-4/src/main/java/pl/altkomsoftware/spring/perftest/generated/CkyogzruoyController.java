package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CkyogzruoyController {

    private final CkyogzruoyService ckyogzruoyService;

    public CkyogzruoyController(CkyogzruoyService ckyogzruoyService) {
        this.ckyogzruoyService = ckyogzruoyService;
    }

    @RequestMapping("/ckyogzruoy")
    public String index() {
        return ckyogzruoyService.getGreeting();
    }

}
