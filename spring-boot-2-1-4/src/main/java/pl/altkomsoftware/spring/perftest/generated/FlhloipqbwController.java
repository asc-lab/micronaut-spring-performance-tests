package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class FlhloipqbwController {

    private final FlhloipqbwService flhloipqbwService;

    public FlhloipqbwController(FlhloipqbwService flhloipqbwService) {
        this.flhloipqbwService = flhloipqbwService;
    }

    @RequestMapping("/flhloipqbw")
    public String index() {
        return flhloipqbwService.getGreeting();
    }

}
