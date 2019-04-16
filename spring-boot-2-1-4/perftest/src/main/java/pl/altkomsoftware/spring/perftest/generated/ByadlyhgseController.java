package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ByadlyhgseController {

    private final ByadlyhgseService byadlyhgseService;

    public ByadlyhgseController(ByadlyhgseService byadlyhgseService) {
        this.byadlyhgseService = byadlyhgseService;
    }

    @RequestMapping("/byadlyhgse")
    public String index() {
        return byadlyhgseService.getGreeting();
    }

}
