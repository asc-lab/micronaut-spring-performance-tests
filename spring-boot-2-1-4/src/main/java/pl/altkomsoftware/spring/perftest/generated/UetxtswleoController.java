package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class UetxtswleoController {

    private final UetxtswleoService uetxtswleoService;

    public UetxtswleoController(UetxtswleoService uetxtswleoService) {
        this.uetxtswleoService = uetxtswleoService;
    }

    @RequestMapping("/uetxtswleo")
    public String index() {
        return uetxtswleoService.getGreeting();
    }

}
