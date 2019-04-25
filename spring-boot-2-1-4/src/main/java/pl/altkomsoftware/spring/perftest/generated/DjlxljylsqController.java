package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DjlxljylsqController {

    private final DjlxljylsqService djlxljylsqService;

    public DjlxljylsqController(DjlxljylsqService djlxljylsqService) {
        this.djlxljylsqService = djlxljylsqService;
    }

    @RequestMapping("/djlxljylsq")
    public String index() {
        return djlxljylsqService.getGreeting();
    }

}
