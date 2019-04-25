package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class NaceetbtymController {

    private final NaceetbtymService naceetbtymService;

    public NaceetbtymController(NaceetbtymService naceetbtymService) {
        this.naceetbtymService = naceetbtymService;
    }

    @RequestMapping("/naceetbtym")
    public String index() {
        return naceetbtymService.getGreeting();
    }

}
