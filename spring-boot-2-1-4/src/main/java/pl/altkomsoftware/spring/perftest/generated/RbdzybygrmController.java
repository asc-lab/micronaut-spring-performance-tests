package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class RbdzybygrmController {

    private final RbdzybygrmService rbdzybygrmService;

    public RbdzybygrmController(RbdzybygrmService rbdzybygrmService) {
        this.rbdzybygrmService = rbdzybygrmService;
    }

    @RequestMapping("/rbdzybygrm")
    public String index() {
        return rbdzybygrmService.getGreeting();
    }

}
