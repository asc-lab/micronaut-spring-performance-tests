package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class RqpdpswngjController {

    private final RqpdpswngjService rqpdpswngjService;

    public RqpdpswngjController(RqpdpswngjService rqpdpswngjService) {
        this.rqpdpswngjService = rqpdpswngjService;
    }

    @RequestMapping("/rqpdpswngj")
    public String index() {
        return rqpdpswngjService.getGreeting();
    }

}
