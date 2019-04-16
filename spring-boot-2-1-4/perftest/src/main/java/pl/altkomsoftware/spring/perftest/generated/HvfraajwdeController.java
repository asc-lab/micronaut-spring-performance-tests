package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HvfraajwdeController {

    private final HvfraajwdeService hvfraajwdeService;

    public HvfraajwdeController(HvfraajwdeService hvfraajwdeService) {
        this.hvfraajwdeService = hvfraajwdeService;
    }

    @RequestMapping("/hvfraajwde")
    public String index() {
        return hvfraajwdeService.getGreeting();
    }

}
