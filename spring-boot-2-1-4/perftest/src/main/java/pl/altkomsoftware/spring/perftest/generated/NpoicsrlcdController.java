package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class NpoicsrlcdController {

    private final NpoicsrlcdService npoicsrlcdService;

    public NpoicsrlcdController(NpoicsrlcdService npoicsrlcdService) {
        this.npoicsrlcdService = npoicsrlcdService;
    }

    @RequestMapping("/npoicsrlcd")
    public String index() {
        return npoicsrlcdService.getGreeting();
    }

}
