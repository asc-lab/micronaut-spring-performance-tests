package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class YprtcriepmController {

    private final YprtcriepmService yprtcriepmService;

    public YprtcriepmController(YprtcriepmService yprtcriepmService) {
        this.yprtcriepmService = yprtcriepmService;
    }

    @RequestMapping("/yprtcriepm")
    public String index() {
        return yprtcriepmService.getGreeting();
    }

}
