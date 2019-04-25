package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class RwvicmybpvController {

    private final RwvicmybpvService rwvicmybpvService;

    public RwvicmybpvController(RwvicmybpvService rwvicmybpvService) {
        this.rwvicmybpvService = rwvicmybpvService;
    }

    @RequestMapping("/rwvicmybpv")
    public String index() {
        return rwvicmybpvService.getGreeting();
    }

}
