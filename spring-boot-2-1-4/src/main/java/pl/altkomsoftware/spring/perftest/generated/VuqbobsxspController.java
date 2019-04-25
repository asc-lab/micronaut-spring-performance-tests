package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class VuqbobsxspController {

    private final VuqbobsxspService vuqbobsxspService;

    public VuqbobsxspController(VuqbobsxspService vuqbobsxspService) {
        this.vuqbobsxspService = vuqbobsxspService;
    }

    @RequestMapping("/vuqbobsxsp")
    public String index() {
        return vuqbobsxspService.getGreeting();
    }

}
