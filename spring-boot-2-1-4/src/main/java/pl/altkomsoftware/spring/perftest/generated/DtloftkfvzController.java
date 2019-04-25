package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DtloftkfvzController {

    private final DtloftkfvzService dtloftkfvzService;

    public DtloftkfvzController(DtloftkfvzService dtloftkfvzService) {
        this.dtloftkfvzService = dtloftkfvzService;
    }

    @RequestMapping("/dtloftkfvz")
    public String index() {
        return dtloftkfvzService.getGreeting();
    }

}
