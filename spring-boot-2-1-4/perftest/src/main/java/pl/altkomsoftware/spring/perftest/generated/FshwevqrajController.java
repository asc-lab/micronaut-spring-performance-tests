package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class FshwevqrajController {

    private final FshwevqrajService fshwevqrajService;

    public FshwevqrajController(FshwevqrajService fshwevqrajService) {
        this.fshwevqrajService = fshwevqrajService;
    }

    @RequestMapping("/fshwevqraj")
    public String index() {
        return fshwevqrajService.getGreeting();
    }

}
