package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class GpzsnioqoyController {

    private final GpzsnioqoyService gpzsnioqoyService;

    public GpzsnioqoyController(GpzsnioqoyService gpzsnioqoyService) {
        this.gpzsnioqoyService = gpzsnioqoyService;
    }

    @RequestMapping("/gpzsnioqoy")
    public String index() {
        return gpzsnioqoyService.getGreeting();
    }

}
