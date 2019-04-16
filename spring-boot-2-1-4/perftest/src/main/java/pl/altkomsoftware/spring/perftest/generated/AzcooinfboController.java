package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class AzcooinfboController {

    private final AzcooinfboService azcooinfboService;

    public AzcooinfboController(AzcooinfboService azcooinfboService) {
        this.azcooinfboService = azcooinfboService;
    }

    @RequestMapping("/azcooinfbo")
    public String index() {
        return azcooinfboService.getGreeting();
    }

}
