package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class EhnqlbcohoController {

    private final EhnqlbcohoService ehnqlbcohoService;

    public EhnqlbcohoController(EhnqlbcohoService ehnqlbcohoService) {
        this.ehnqlbcohoService = ehnqlbcohoService;
    }

    @RequestMapping("/ehnqlbcoho")
    public String index() {
        return ehnqlbcohoService.getGreeting();
    }

}
