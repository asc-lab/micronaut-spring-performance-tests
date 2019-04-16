package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class NdanehrzljController {

    private final NdanehrzljService ndanehrzljService;

    public NdanehrzljController(NdanehrzljService ndanehrzljService) {
        this.ndanehrzljService = ndanehrzljService;
    }

    @RequestMapping("/ndanehrzlj")
    public String index() {
        return ndanehrzljService.getGreeting();
    }

}
