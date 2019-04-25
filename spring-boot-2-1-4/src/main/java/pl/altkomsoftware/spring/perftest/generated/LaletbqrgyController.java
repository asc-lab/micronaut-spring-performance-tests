package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class LaletbqrgyController {

    private final LaletbqrgyService laletbqrgyService;

    public LaletbqrgyController(LaletbqrgyService laletbqrgyService) {
        this.laletbqrgyService = laletbqrgyService;
    }

    @RequestMapping("/laletbqrgy")
    public String index() {
        return laletbqrgyService.getGreeting();
    }

}
