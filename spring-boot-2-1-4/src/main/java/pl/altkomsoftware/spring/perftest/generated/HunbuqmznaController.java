package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HunbuqmznaController {

    private final HunbuqmznaService hunbuqmznaService;

    public HunbuqmznaController(HunbuqmznaService hunbuqmznaService) {
        this.hunbuqmznaService = hunbuqmznaService;
    }

    @RequestMapping("/hunbuqmzna")
    public String index() {
        return hunbuqmznaService.getGreeting();
    }

}
