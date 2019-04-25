package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class OzmgtryveeController {

    private final OzmgtryveeService ozmgtryveeService;

    public OzmgtryveeController(OzmgtryveeService ozmgtryveeService) {
        this.ozmgtryveeService = ozmgtryveeService;
    }

    @RequestMapping("/ozmgtryvee")
    public String index() {
        return ozmgtryveeService.getGreeting();
    }

}
