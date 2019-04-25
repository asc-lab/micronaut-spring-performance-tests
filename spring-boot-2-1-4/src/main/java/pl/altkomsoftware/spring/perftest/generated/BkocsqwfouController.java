package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class BkocsqwfouController {

    private final BkocsqwfouService bkocsqwfouService;

    public BkocsqwfouController(BkocsqwfouService bkocsqwfouService) {
        this.bkocsqwfouService = bkocsqwfouService;
    }

    @RequestMapping("/bkocsqwfou")
    public String index() {
        return bkocsqwfouService.getGreeting();
    }

}
