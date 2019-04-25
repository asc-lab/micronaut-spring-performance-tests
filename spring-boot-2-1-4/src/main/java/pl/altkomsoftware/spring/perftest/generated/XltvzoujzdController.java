package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class XltvzoujzdController {

    private final XltvzoujzdService xltvzoujzdService;

    public XltvzoujzdController(XltvzoujzdService xltvzoujzdService) {
        this.xltvzoujzdService = xltvzoujzdService;
    }

    @RequestMapping("/xltvzoujzd")
    public String index() {
        return xltvzoujzdService.getGreeting();
    }

}
