package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class BrhenpacglController {

    private final BrhenpacglService brhenpacglService;

    public BrhenpacglController(BrhenpacglService brhenpacglService) {
        this.brhenpacglService = brhenpacglService;
    }

    @RequestMapping("/brhenpacgl")
    public String index() {
        return brhenpacglService.getGreeting();
    }

}
