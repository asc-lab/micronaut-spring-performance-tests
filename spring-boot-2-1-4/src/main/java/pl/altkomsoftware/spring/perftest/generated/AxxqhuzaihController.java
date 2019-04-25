package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class AxxqhuzaihController {

    private final AxxqhuzaihService axxqhuzaihService;

    public AxxqhuzaihController(AxxqhuzaihService axxqhuzaihService) {
        this.axxqhuzaihService = axxqhuzaihService;
    }

    @RequestMapping("/axxqhuzaih")
    public String index() {
        return axxqhuzaihService.getGreeting();
    }

}
