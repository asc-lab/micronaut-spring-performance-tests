package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class AicovazrttController {

    private final AicovazrttService aicovazrttService;

    public AicovazrttController(AicovazrttService aicovazrttService) {
        this.aicovazrttService = aicovazrttService;
    }

    @RequestMapping("/aicovazrtt")
    public String index() {
        return aicovazrttService.getGreeting();
    }

}
