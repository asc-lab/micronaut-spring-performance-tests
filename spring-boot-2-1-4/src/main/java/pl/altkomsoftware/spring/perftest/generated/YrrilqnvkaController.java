package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class YrrilqnvkaController {

    private final YrrilqnvkaService yrrilqnvkaService;

    public YrrilqnvkaController(YrrilqnvkaService yrrilqnvkaService) {
        this.yrrilqnvkaService = yrrilqnvkaService;
    }

    @RequestMapping("/yrrilqnvka")
    public String index() {
        return yrrilqnvkaService.getGreeting();
    }

}
