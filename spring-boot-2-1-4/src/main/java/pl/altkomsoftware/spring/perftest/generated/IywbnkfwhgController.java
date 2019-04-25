package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class IywbnkfwhgController {

    private final IywbnkfwhgService iywbnkfwhgService;

    public IywbnkfwhgController(IywbnkfwhgService iywbnkfwhgService) {
        this.iywbnkfwhgService = iywbnkfwhgService;
    }

    @RequestMapping("/iywbnkfwhg")
    public String index() {
        return iywbnkfwhgService.getGreeting();
    }

}
