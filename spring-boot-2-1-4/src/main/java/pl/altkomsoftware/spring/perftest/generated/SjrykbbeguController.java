package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SjrykbbeguController {

    private final SjrykbbeguService sjrykbbeguService;

    public SjrykbbeguController(SjrykbbeguService sjrykbbeguService) {
        this.sjrykbbeguService = sjrykbbeguService;
    }

    @RequestMapping("/sjrykbbegu")
    public String index() {
        return sjrykbbeguService.getGreeting();
    }

}
