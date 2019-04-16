package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class JutgwkgzdaController {

    private final JutgwkgzdaService jutgwkgzdaService;

    public JutgwkgzdaController(JutgwkgzdaService jutgwkgzdaService) {
        this.jutgwkgzdaService = jutgwkgzdaService;
    }

    @RequestMapping("/jutgwkgzda")
    public String index() {
        return jutgwkgzdaService.getGreeting();
    }

}
