package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class KkmfnmuvvbController {

    private final KkmfnmuvvbService kkmfnmuvvbService;

    public KkmfnmuvvbController(KkmfnmuvvbService kkmfnmuvvbService) {
        this.kkmfnmuvvbService = kkmfnmuvvbService;
    }

    @RequestMapping("/kkmfnmuvvb")
    public String index() {
        return kkmfnmuvvbService.getGreeting();
    }

}
