package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ErypidouzrController {

    private final ErypidouzrService erypidouzrService;

    public ErypidouzrController(ErypidouzrService erypidouzrService) {
        this.erypidouzrService = erypidouzrService;
    }

    @RequestMapping("/erypidouzr")
    public String index() {
        return erypidouzrService.getGreeting();
    }

}
