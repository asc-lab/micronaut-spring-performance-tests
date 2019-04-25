package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class GqeetxujizController {

    private final GqeetxujizService gqeetxujizService;

    public GqeetxujizController(GqeetxujizService gqeetxujizService) {
        this.gqeetxujizService = gqeetxujizService;
    }

    @RequestMapping("/gqeetxujiz")
    public String index() {
        return gqeetxujizService.getGreeting();
    }

}
