package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class UpddsgrjbwController {

    private final UpddsgrjbwService upddsgrjbwService;

    public UpddsgrjbwController(UpddsgrjbwService upddsgrjbwService) {
        this.upddsgrjbwService = upddsgrjbwService;
    }

    @RequestMapping("/upddsgrjbw")
    public String index() {
        return upddsgrjbwService.getGreeting();
    }

}
