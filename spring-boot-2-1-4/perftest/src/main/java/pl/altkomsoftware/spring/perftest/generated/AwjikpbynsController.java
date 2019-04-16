package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class AwjikpbynsController {

    private final AwjikpbynsService awjikpbynsService;

    public AwjikpbynsController(AwjikpbynsService awjikpbynsService) {
        this.awjikpbynsService = awjikpbynsService;
    }

    @RequestMapping("/awjikpbyns")
    public String index() {
        return awjikpbynsService.getGreeting();
    }

}
