package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class OhcukbdjjwController {

    private final OhcukbdjjwService ohcukbdjjwService;

    public OhcukbdjjwController(OhcukbdjjwService ohcukbdjjwService) {
        this.ohcukbdjjwService = ohcukbdjjwService;
    }

    @RequestMapping("/ohcukbdjjw")
    public String index() {
        return ohcukbdjjwService.getGreeting();
    }

}
