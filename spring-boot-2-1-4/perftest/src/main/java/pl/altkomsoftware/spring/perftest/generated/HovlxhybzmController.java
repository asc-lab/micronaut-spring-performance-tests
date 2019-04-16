package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HovlxhybzmController {

    private final HovlxhybzmService hovlxhybzmService;

    public HovlxhybzmController(HovlxhybzmService hovlxhybzmService) {
        this.hovlxhybzmService = hovlxhybzmService;
    }

    @RequestMapping("/hovlxhybzm")
    public String index() {
        return hovlxhybzmService.getGreeting();
    }

}
