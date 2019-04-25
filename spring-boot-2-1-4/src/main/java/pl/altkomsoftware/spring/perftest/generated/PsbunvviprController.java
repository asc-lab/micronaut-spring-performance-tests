package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class PsbunvviprController {

    private final PsbunvviprService psbunvviprService;

    public PsbunvviprController(PsbunvviprService psbunvviprService) {
        this.psbunvviprService = psbunvviprService;
    }

    @RequestMapping("/psbunvvipr")
    public String index() {
        return psbunvviprService.getGreeting();
    }

}
