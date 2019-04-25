package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class OsvlrxyklkController {

    private final OsvlrxyklkService osvlrxyklkService;

    public OsvlrxyklkController(OsvlrxyklkService osvlrxyklkService) {
        this.osvlrxyklkService = osvlrxyklkService;
    }

    @RequestMapping("/osvlrxyklk")
    public String index() {
        return osvlrxyklkService.getGreeting();
    }

}
