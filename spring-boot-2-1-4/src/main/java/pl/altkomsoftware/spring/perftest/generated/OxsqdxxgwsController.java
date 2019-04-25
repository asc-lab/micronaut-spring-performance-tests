package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class OxsqdxxgwsController {

    private final OxsqdxxgwsService oxsqdxxgwsService;

    public OxsqdxxgwsController(OxsqdxxgwsService oxsqdxxgwsService) {
        this.oxsqdxxgwsService = oxsqdxxgwsService;
    }

    @RequestMapping("/oxsqdxxgws")
    public String index() {
        return oxsqdxxgwsService.getGreeting();
    }

}
