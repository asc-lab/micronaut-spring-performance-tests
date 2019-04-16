package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class KamxpeuvndController {

    private final KamxpeuvndService kamxpeuvndService;

    public KamxpeuvndController(KamxpeuvndService kamxpeuvndService) {
        this.kamxpeuvndService = kamxpeuvndService;
    }

    @RequestMapping("/kamxpeuvnd")
    public String index() {
        return kamxpeuvndService.getGreeting();
    }

}
