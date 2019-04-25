package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MuydmnwudfController {

    private final MuydmnwudfService muydmnwudfService;

    public MuydmnwudfController(MuydmnwudfService muydmnwudfService) {
        this.muydmnwudfService = muydmnwudfService;
    }

    @RequestMapping("/muydmnwudf")
    public String index() {
        return muydmnwudfService.getGreeting();
    }

}
