package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class RlhybllptfController {

    private final RlhybllptfService rlhybllptfService;

    public RlhybllptfController(RlhybllptfService rlhybllptfService) {
        this.rlhybllptfService = rlhybllptfService;
    }

    @RequestMapping("/rlhybllptf")
    public String index() {
        return rlhybllptfService.getGreeting();
    }

}
