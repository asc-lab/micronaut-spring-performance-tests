package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class GwnfudhxqbController {

    private final GwnfudhxqbService gwnfudhxqbService;

    public GwnfudhxqbController(GwnfudhxqbService gwnfudhxqbService) {
        this.gwnfudhxqbService = gwnfudhxqbService;
    }

    @RequestMapping("/gwnfudhxqb")
    public String index() {
        return gwnfudhxqbService.getGreeting();
    }

}
