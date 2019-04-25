package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class PdlgslgxipController {

    private final PdlgslgxipService pdlgslgxipService;

    public PdlgslgxipController(PdlgslgxipService pdlgslgxipService) {
        this.pdlgslgxipService = pdlgslgxipService;
    }

    @RequestMapping("/pdlgslgxip")
    public String index() {
        return pdlgslgxipService.getGreeting();
    }

}
