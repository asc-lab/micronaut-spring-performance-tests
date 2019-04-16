package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ZgnpmcnqnkController {

    private final ZgnpmcnqnkService zgnpmcnqnkService;

    public ZgnpmcnqnkController(ZgnpmcnqnkService zgnpmcnqnkService) {
        this.zgnpmcnqnkService = zgnpmcnqnkService;
    }

    @RequestMapping("/zgnpmcnqnk")
    public String index() {
        return zgnpmcnqnkService.getGreeting();
    }

}
