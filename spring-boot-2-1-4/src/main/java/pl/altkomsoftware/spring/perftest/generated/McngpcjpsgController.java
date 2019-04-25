package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class McngpcjpsgController {

    private final McngpcjpsgService mcngpcjpsgService;

    public McngpcjpsgController(McngpcjpsgService mcngpcjpsgService) {
        this.mcngpcjpsgService = mcngpcjpsgService;
    }

    @RequestMapping("/mcngpcjpsg")
    public String index() {
        return mcngpcjpsgService.getGreeting();
    }

}
