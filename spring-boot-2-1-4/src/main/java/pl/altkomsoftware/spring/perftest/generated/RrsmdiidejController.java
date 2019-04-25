package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class RrsmdiidejController {

    private final RrsmdiidejService rrsmdiidejService;

    public RrsmdiidejController(RrsmdiidejService rrsmdiidejService) {
        this.rrsmdiidejService = rrsmdiidejService;
    }

    @RequestMapping("/rrsmdiidej")
    public String index() {
        return rrsmdiidejService.getGreeting();
    }

}
