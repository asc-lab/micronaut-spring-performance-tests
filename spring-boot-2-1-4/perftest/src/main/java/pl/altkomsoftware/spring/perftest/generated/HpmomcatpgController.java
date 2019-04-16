package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HpmomcatpgController {

    private final HpmomcatpgService hpmomcatpgService;

    public HpmomcatpgController(HpmomcatpgService hpmomcatpgService) {
        this.hpmomcatpgService = hpmomcatpgService;
    }

    @RequestMapping("/hpmomcatpg")
    public String index() {
        return hpmomcatpgService.getGreeting();
    }

}
