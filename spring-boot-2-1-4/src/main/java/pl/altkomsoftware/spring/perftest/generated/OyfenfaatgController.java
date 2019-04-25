package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class OyfenfaatgController {

    private final OyfenfaatgService oyfenfaatgService;

    public OyfenfaatgController(OyfenfaatgService oyfenfaatgService) {
        this.oyfenfaatgService = oyfenfaatgService;
    }

    @RequestMapping("/oyfenfaatg")
    public String index() {
        return oyfenfaatgService.getGreeting();
    }

}
