package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class JyvmrapwnvController {

    private final JyvmrapwnvService jyvmrapwnvService;

    public JyvmrapwnvController(JyvmrapwnvService jyvmrapwnvService) {
        this.jyvmrapwnvService = jyvmrapwnvService;
    }

    @RequestMapping("/jyvmrapwnv")
    public String index() {
        return jyvmrapwnvService.getGreeting();
    }

}
