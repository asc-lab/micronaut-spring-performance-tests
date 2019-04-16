package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class InunpzlnmtController {

    private final InunpzlnmtService inunpzlnmtService;

    public InunpzlnmtController(InunpzlnmtService inunpzlnmtService) {
        this.inunpzlnmtService = inunpzlnmtService;
    }

    @RequestMapping("/inunpzlnmt")
    public String index() {
        return inunpzlnmtService.getGreeting();
    }

}
