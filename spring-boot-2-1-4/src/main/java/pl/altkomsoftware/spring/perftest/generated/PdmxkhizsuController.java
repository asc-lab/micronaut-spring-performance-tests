package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class PdmxkhizsuController {

    private final PdmxkhizsuService pdmxkhizsuService;

    public PdmxkhizsuController(PdmxkhizsuService pdmxkhizsuService) {
        this.pdmxkhizsuService = pdmxkhizsuService;
    }

    @RequestMapping("/pdmxkhizsu")
    public String index() {
        return pdmxkhizsuService.getGreeting();
    }

}
