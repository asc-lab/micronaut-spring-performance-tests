package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class NlbpnznnxyController {

    private final NlbpnznnxyService nlbpnznnxyService;

    public NlbpnznnxyController(NlbpnznnxyService nlbpnznnxyService) {
        this.nlbpnznnxyService = nlbpnznnxyService;
    }

    @RequestMapping("/nlbpnznnxy")
    public String index() {
        return nlbpnznnxyService.getGreeting();
    }

}
