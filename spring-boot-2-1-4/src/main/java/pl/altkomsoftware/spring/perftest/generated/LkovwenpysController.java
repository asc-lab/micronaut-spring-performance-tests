package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class LkovwenpysController {

    private final LkovwenpysService lkovwenpysService;

    public LkovwenpysController(LkovwenpysService lkovwenpysService) {
        this.lkovwenpysService = lkovwenpysService;
    }

    @RequestMapping("/lkovwenpys")
    public String index() {
        return lkovwenpysService.getGreeting();
    }

}
