package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class FhokffdrsdController {

    private final FhokffdrsdService fhokffdrsdService;

    public FhokffdrsdController(FhokffdrsdService fhokffdrsdService) {
        this.fhokffdrsdService = fhokffdrsdService;
    }

    @RequestMapping("/fhokffdrsd")
    public String index() {
        return fhokffdrsdService.getGreeting();
    }

}
