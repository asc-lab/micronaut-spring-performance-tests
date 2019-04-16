package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class EuinbjkfylController {

    private final EuinbjkfylService euinbjkfylService;

    public EuinbjkfylController(EuinbjkfylService euinbjkfylService) {
        this.euinbjkfylService = euinbjkfylService;
    }

    @RequestMapping("/euinbjkfyl")
    public String index() {
        return euinbjkfylService.getGreeting();
    }

}
