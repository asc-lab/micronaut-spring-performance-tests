package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class TdcbfdhsawController {

    private final TdcbfdhsawService tdcbfdhsawService;

    public TdcbfdhsawController(TdcbfdhsawService tdcbfdhsawService) {
        this.tdcbfdhsawService = tdcbfdhsawService;
    }

    @RequestMapping("/tdcbfdhsaw")
    public String index() {
        return tdcbfdhsawService.getGreeting();
    }

}
