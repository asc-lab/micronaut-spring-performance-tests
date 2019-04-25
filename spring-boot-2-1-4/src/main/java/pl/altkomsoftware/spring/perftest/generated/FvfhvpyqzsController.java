package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class FvfhvpyqzsController {

    private final FvfhvpyqzsService fvfhvpyqzsService;

    public FvfhvpyqzsController(FvfhvpyqzsService fvfhvpyqzsService) {
        this.fvfhvpyqzsService = fvfhvpyqzsService;
    }

    @RequestMapping("/fvfhvpyqzs")
    public String index() {
        return fvfhvpyqzsService.getGreeting();
    }

}
