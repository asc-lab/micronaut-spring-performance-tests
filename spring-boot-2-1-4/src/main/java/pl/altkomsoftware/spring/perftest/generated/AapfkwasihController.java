package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class AapfkwasihController {

    private final AapfkwasihService aapfkwasihService;

    public AapfkwasihController(AapfkwasihService aapfkwasihService) {
        this.aapfkwasihService = aapfkwasihService;
    }

    @RequestMapping("/aapfkwasih")
    public String index() {
        return aapfkwasihService.getGreeting();
    }

}
