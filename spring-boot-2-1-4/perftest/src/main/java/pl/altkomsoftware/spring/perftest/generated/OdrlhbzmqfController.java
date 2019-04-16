package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class OdrlhbzmqfController {

    private final OdrlhbzmqfService odrlhbzmqfService;

    public OdrlhbzmqfController(OdrlhbzmqfService odrlhbzmqfService) {
        this.odrlhbzmqfService = odrlhbzmqfService;
    }

    @RequestMapping("/odrlhbzmqf")
    public String index() {
        return odrlhbzmqfService.getGreeting();
    }

}
