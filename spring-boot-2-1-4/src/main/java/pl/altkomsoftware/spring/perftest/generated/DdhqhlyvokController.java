package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DdhqhlyvokController {

    private final DdhqhlyvokService ddhqhlyvokService;

    public DdhqhlyvokController(DdhqhlyvokService ddhqhlyvokService) {
        this.ddhqhlyvokService = ddhqhlyvokService;
    }

    @RequestMapping("/ddhqhlyvok")
    public String index() {
        return ddhqhlyvokService.getGreeting();
    }

}
