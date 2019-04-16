package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DjajiggreqController {

    private final DjajiggreqService djajiggreqService;

    public DjajiggreqController(DjajiggreqService djajiggreqService) {
        this.djajiggreqService = djajiggreqService;
    }

    @RequestMapping("/djajiggreq")
    public String index() {
        return djajiggreqService.getGreeting();
    }

}
