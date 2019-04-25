package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class KuzxglpqijController {

    private final KuzxglpqijService kuzxglpqijService;

    public KuzxglpqijController(KuzxglpqijService kuzxglpqijService) {
        this.kuzxglpqijService = kuzxglpqijService;
    }

    @RequestMapping("/kuzxglpqij")
    public String index() {
        return kuzxglpqijService.getGreeting();
    }

}
