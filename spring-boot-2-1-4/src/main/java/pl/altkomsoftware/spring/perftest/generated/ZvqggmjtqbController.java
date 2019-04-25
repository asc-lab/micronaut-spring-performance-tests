package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ZvqggmjtqbController {

    private final ZvqggmjtqbService zvqggmjtqbService;

    public ZvqggmjtqbController(ZvqggmjtqbService zvqggmjtqbService) {
        this.zvqggmjtqbService = zvqggmjtqbService;
    }

    @RequestMapping("/zvqggmjtqb")
    public String index() {
        return zvqggmjtqbService.getGreeting();
    }

}
