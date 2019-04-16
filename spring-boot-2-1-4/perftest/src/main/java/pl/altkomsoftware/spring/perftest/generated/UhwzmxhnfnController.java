package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class UhwzmxhnfnController {

    private final UhwzmxhnfnService uhwzmxhnfnService;

    public UhwzmxhnfnController(UhwzmxhnfnService uhwzmxhnfnService) {
        this.uhwzmxhnfnService = uhwzmxhnfnService;
    }

    @RequestMapping("/uhwzmxhnfn")
    public String index() {
        return uhwzmxhnfnService.getGreeting();
    }

}
