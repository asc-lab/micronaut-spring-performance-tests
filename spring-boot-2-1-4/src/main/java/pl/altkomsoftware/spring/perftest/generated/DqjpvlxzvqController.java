package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DqjpvlxzvqController {

    private final DqjpvlxzvqService dqjpvlxzvqService;

    public DqjpvlxzvqController(DqjpvlxzvqService dqjpvlxzvqService) {
        this.dqjpvlxzvqService = dqjpvlxzvqService;
    }

    @RequestMapping("/dqjpvlxzvq")
    public String index() {
        return dqjpvlxzvqService.getGreeting();
    }

}
