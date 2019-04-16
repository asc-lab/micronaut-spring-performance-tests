package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CwzfhlqveaController {

    private final CwzfhlqveaService cwzfhlqveaService;

    public CwzfhlqveaController(CwzfhlqveaService cwzfhlqveaService) {
        this.cwzfhlqveaService = cwzfhlqveaService;
    }

    @RequestMapping("/cwzfhlqvea")
    public String index() {
        return cwzfhlqveaService.getGreeting();
    }

}
