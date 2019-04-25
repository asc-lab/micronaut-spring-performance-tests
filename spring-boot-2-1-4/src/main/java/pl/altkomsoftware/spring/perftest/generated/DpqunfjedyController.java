package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DpqunfjedyController {

    private final DpqunfjedyService dpqunfjedyService;

    public DpqunfjedyController(DpqunfjedyService dpqunfjedyService) {
        this.dpqunfjedyService = dpqunfjedyService;
    }

    @RequestMapping("/dpqunfjedy")
    public String index() {
        return dpqunfjedyService.getGreeting();
    }

}
