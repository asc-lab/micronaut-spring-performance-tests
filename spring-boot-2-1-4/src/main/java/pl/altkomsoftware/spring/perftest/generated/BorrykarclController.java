package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class BorrykarclController {

    private final BorrykarclService borrykarclService;

    public BorrykarclController(BorrykarclService borrykarclService) {
        this.borrykarclService = borrykarclService;
    }

    @RequestMapping("/borrykarcl")
    public String index() {
        return borrykarclService.getGreeting();
    }

}
