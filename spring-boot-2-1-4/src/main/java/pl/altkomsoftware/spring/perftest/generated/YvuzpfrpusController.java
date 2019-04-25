package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class YvuzpfrpusController {

    private final YvuzpfrpusService yvuzpfrpusService;

    public YvuzpfrpusController(YvuzpfrpusService yvuzpfrpusService) {
        this.yvuzpfrpusService = yvuzpfrpusService;
    }

    @RequestMapping("/yvuzpfrpus")
    public String index() {
        return yvuzpfrpusService.getGreeting();
    }

}
