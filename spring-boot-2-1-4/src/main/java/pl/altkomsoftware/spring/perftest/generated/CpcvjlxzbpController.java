package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CpcvjlxzbpController {

    private final CpcvjlxzbpService cpcvjlxzbpService;

    public CpcvjlxzbpController(CpcvjlxzbpService cpcvjlxzbpService) {
        this.cpcvjlxzbpService = cpcvjlxzbpService;
    }

    @RequestMapping("/cpcvjlxzbp")
    public String index() {
        return cpcvjlxzbpService.getGreeting();
    }

}
