package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class BateoqzwoqController {

    private final BateoqzwoqService bateoqzwoqService;

    public BateoqzwoqController(BateoqzwoqService bateoqzwoqService) {
        this.bateoqzwoqService = bateoqzwoqService;
    }

    @RequestMapping("/bateoqzwoq")
    public String index() {
        return bateoqzwoqService.getGreeting();
    }

}
