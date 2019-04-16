package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ScyhowmhqfController {

    private final ScyhowmhqfService scyhowmhqfService;

    public ScyhowmhqfController(ScyhowmhqfService scyhowmhqfService) {
        this.scyhowmhqfService = scyhowmhqfService;
    }

    @RequestMapping("/scyhowmhqf")
    public String index() {
        return scyhowmhqfService.getGreeting();
    }

}
