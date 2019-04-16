package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class AhahzyfnjcController {

    private final AhahzyfnjcService ahahzyfnjcService;

    public AhahzyfnjcController(AhahzyfnjcService ahahzyfnjcService) {
        this.ahahzyfnjcService = ahahzyfnjcService;
    }

    @RequestMapping("/ahahzyfnjc")
    public String index() {
        return ahahzyfnjcService.getGreeting();
    }

}
