package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class IjrcjurpxcController {

    private final IjrcjurpxcService ijrcjurpxcService;

    public IjrcjurpxcController(IjrcjurpxcService ijrcjurpxcService) {
        this.ijrcjurpxcService = ijrcjurpxcService;
    }

    @RequestMapping("/ijrcjurpxc")
    public String index() {
        return ijrcjurpxcService.getGreeting();
    }

}
