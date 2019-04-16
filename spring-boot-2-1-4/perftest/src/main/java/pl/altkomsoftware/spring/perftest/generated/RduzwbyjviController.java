package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class RduzwbyjviController {

    private final RduzwbyjviService rduzwbyjviService;

    public RduzwbyjviController(RduzwbyjviService rduzwbyjviService) {
        this.rduzwbyjviService = rduzwbyjviService;
    }

    @RequestMapping("/rduzwbyjvi")
    public String index() {
        return rduzwbyjviService.getGreeting();
    }

}
