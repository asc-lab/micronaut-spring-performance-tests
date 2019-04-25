package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class RpmibswdvqController {

    private final RpmibswdvqService rpmibswdvqService;

    public RpmibswdvqController(RpmibswdvqService rpmibswdvqService) {
        this.rpmibswdvqService = rpmibswdvqService;
    }

    @RequestMapping("/rpmibswdvq")
    public String index() {
        return rpmibswdvqService.getGreeting();
    }

}
