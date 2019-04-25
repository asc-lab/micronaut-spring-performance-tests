package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MlbubqpkrgController {

    private final MlbubqpkrgService mlbubqpkrgService;

    public MlbubqpkrgController(MlbubqpkrgService mlbubqpkrgService) {
        this.mlbubqpkrgService = mlbubqpkrgService;
    }

    @RequestMapping("/mlbubqpkrg")
    public String index() {
        return mlbubqpkrgService.getGreeting();
    }

}
