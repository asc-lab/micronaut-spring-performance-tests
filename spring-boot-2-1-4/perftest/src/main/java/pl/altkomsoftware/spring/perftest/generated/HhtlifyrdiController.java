package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HhtlifyrdiController {

    private final HhtlifyrdiService hhtlifyrdiService;

    public HhtlifyrdiController(HhtlifyrdiService hhtlifyrdiService) {
        this.hhtlifyrdiService = hhtlifyrdiService;
    }

    @RequestMapping("/hhtlifyrdi")
    public String index() {
        return hhtlifyrdiService.getGreeting();
    }

}
