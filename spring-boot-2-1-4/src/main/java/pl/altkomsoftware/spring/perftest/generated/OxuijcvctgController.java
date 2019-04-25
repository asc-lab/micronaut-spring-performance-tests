package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class OxuijcvctgController {

    private final OxuijcvctgService oxuijcvctgService;

    public OxuijcvctgController(OxuijcvctgService oxuijcvctgService) {
        this.oxuijcvctgService = oxuijcvctgService;
    }

    @RequestMapping("/oxuijcvctg")
    public String index() {
        return oxuijcvctgService.getGreeting();
    }

}
