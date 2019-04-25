package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class OgydrozlqqController {

    private final OgydrozlqqService ogydrozlqqService;

    public OgydrozlqqController(OgydrozlqqService ogydrozlqqService) {
        this.ogydrozlqqService = ogydrozlqqService;
    }

    @RequestMapping("/ogydrozlqq")
    public String index() {
        return ogydrozlqqService.getGreeting();
    }

}
