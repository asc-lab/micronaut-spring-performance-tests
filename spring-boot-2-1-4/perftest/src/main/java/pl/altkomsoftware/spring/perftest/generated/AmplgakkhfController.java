package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class AmplgakkhfController {

    private final AmplgakkhfService amplgakkhfService;

    public AmplgakkhfController(AmplgakkhfService amplgakkhfService) {
        this.amplgakkhfService = amplgakkhfService;
    }

    @RequestMapping("/amplgakkhf")
    public String index() {
        return amplgakkhfService.getGreeting();
    }

}
