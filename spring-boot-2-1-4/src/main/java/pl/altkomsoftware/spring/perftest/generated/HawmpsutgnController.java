package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HawmpsutgnController {

    private final HawmpsutgnService hawmpsutgnService;

    public HawmpsutgnController(HawmpsutgnService hawmpsutgnService) {
        this.hawmpsutgnService = hawmpsutgnService;
    }

    @RequestMapping("/hawmpsutgn")
    public String index() {
        return hawmpsutgnService.getGreeting();
    }

}
