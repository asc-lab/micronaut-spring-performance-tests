package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MqhvjcgvanController {

    private final MqhvjcgvanService mqhvjcgvanService;

    public MqhvjcgvanController(MqhvjcgvanService mqhvjcgvanService) {
        this.mqhvjcgvanService = mqhvjcgvanService;
    }

    @RequestMapping("/mqhvjcgvan")
    public String index() {
        return mqhvjcgvanService.getGreeting();
    }

}
