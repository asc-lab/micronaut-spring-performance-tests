package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DepiyofqqmController {

    private final DepiyofqqmService depiyofqqmService;

    public DepiyofqqmController(DepiyofqqmService depiyofqqmService) {
        this.depiyofqqmService = depiyofqqmService;
    }

    @RequestMapping("/depiyofqqm")
    public String index() {
        return depiyofqqmService.getGreeting();
    }

}
