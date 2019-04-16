package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class FrajzhirucController {

    private final FrajzhirucService frajzhirucService;

    public FrajzhirucController(FrajzhirucService frajzhirucService) {
        this.frajzhirucService = frajzhirucService;
    }

    @RequestMapping("/frajzhiruc")
    public String index() {
        return frajzhirucService.getGreeting();
    }

}
