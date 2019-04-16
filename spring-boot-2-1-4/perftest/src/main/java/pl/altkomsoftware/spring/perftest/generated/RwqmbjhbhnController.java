package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class RwqmbjhbhnController {

    private final RwqmbjhbhnService rwqmbjhbhnService;

    public RwqmbjhbhnController(RwqmbjhbhnService rwqmbjhbhnService) {
        this.rwqmbjhbhnService = rwqmbjhbhnService;
    }

    @RequestMapping("/rwqmbjhbhn")
    public String index() {
        return rwqmbjhbhnService.getGreeting();
    }

}
