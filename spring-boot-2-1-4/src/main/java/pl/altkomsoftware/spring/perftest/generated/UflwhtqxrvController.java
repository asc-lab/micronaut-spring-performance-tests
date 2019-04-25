package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class UflwhtqxrvController {

    private final UflwhtqxrvService uflwhtqxrvService;

    public UflwhtqxrvController(UflwhtqxrvService uflwhtqxrvService) {
        this.uflwhtqxrvService = uflwhtqxrvService;
    }

    @RequestMapping("/uflwhtqxrv")
    public String index() {
        return uflwhtqxrvService.getGreeting();
    }

}
