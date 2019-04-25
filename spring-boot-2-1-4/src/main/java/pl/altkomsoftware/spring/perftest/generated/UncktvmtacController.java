package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class UncktvmtacController {

    private final UncktvmtacService uncktvmtacService;

    public UncktvmtacController(UncktvmtacService uncktvmtacService) {
        this.uncktvmtacService = uncktvmtacService;
    }

    @RequestMapping("/uncktvmtac")
    public String index() {
        return uncktvmtacService.getGreeting();
    }

}
