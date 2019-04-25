package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class IgrxmdnvhdController {

    private final IgrxmdnvhdService igrxmdnvhdService;

    public IgrxmdnvhdController(IgrxmdnvhdService igrxmdnvhdService) {
        this.igrxmdnvhdService = igrxmdnvhdService;
    }

    @RequestMapping("/igrxmdnvhd")
    public String index() {
        return igrxmdnvhdService.getGreeting();
    }

}
