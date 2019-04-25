package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ItobfbwysgController {

    private final ItobfbwysgService itobfbwysgService;

    public ItobfbwysgController(ItobfbwysgService itobfbwysgService) {
        this.itobfbwysgService = itobfbwysgService;
    }

    @RequestMapping("/itobfbwysg")
    public String index() {
        return itobfbwysgService.getGreeting();
    }

}
