package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ArrnzfivipController {

    private final ArrnzfivipService arrnzfivipService;

    public ArrnzfivipController(ArrnzfivipService arrnzfivipService) {
        this.arrnzfivipService = arrnzfivipService;
    }

    @RequestMapping("/arrnzfivip")
    public String index() {
        return arrnzfivipService.getGreeting();
    }

}
