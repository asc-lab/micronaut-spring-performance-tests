package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class EidkcvojvjController {

    private final EidkcvojvjService eidkcvojvjService;

    public EidkcvojvjController(EidkcvojvjService eidkcvojvjService) {
        this.eidkcvojvjService = eidkcvojvjService;
    }

    @RequestMapping("/eidkcvojvj")
    public String index() {
        return eidkcvojvjService.getGreeting();
    }

}
