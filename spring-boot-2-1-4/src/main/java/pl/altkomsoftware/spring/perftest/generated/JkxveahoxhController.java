package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class JkxveahoxhController {

    private final JkxveahoxhService jkxveahoxhService;

    public JkxveahoxhController(JkxveahoxhService jkxveahoxhService) {
        this.jkxveahoxhService = jkxveahoxhService;
    }

    @RequestMapping("/jkxveahoxh")
    public String index() {
        return jkxveahoxhService.getGreeting();
    }

}
