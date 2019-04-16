package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class RfhkcuipoqController {

    private final RfhkcuipoqService rfhkcuipoqService;

    public RfhkcuipoqController(RfhkcuipoqService rfhkcuipoqService) {
        this.rfhkcuipoqService = rfhkcuipoqService;
    }

    @RequestMapping("/rfhkcuipoq")
    public String index() {
        return rfhkcuipoqService.getGreeting();
    }

}
