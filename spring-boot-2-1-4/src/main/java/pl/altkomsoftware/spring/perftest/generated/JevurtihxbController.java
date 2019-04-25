package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class JevurtihxbController {

    private final JevurtihxbService jevurtihxbService;

    public JevurtihxbController(JevurtihxbService jevurtihxbService) {
        this.jevurtihxbService = jevurtihxbService;
    }

    @RequestMapping("/jevurtihxb")
    public String index() {
        return jevurtihxbService.getGreeting();
    }

}
