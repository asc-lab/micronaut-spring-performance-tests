package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ZlfvjugpuzController {

    private final ZlfvjugpuzService zlfvjugpuzService;

    public ZlfvjugpuzController(ZlfvjugpuzService zlfvjugpuzService) {
        this.zlfvjugpuzService = zlfvjugpuzService;
    }

    @RequestMapping("/zlfvjugpuz")
    public String index() {
        return zlfvjugpuzService.getGreeting();
    }

}
