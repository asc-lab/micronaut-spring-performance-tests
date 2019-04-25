package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class EjpcstkdgbController {

    private final EjpcstkdgbService ejpcstkdgbService;

    public EjpcstkdgbController(EjpcstkdgbService ejpcstkdgbService) {
        this.ejpcstkdgbService = ejpcstkdgbService;
    }

    @RequestMapping("/ejpcstkdgb")
    public String index() {
        return ejpcstkdgbService.getGreeting();
    }

}
