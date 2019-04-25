package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class JozgfqdwhsController {

    private final JozgfqdwhsService jozgfqdwhsService;

    public JozgfqdwhsController(JozgfqdwhsService jozgfqdwhsService) {
        this.jozgfqdwhsService = jozgfqdwhsService;
    }

    @RequestMapping("/jozgfqdwhs")
    public String index() {
        return jozgfqdwhsService.getGreeting();
    }

}
