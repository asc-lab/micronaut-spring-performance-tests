package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class UvwsqgtgncController {

    private final UvwsqgtgncService uvwsqgtgncService;

    public UvwsqgtgncController(UvwsqgtgncService uvwsqgtgncService) {
        this.uvwsqgtgncService = uvwsqgtgncService;
    }

    @RequestMapping("/uvwsqgtgnc")
    public String index() {
        return uvwsqgtgncService.getGreeting();
    }

}
