package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class UyrpszuzhtController {

    private final UyrpszuzhtService uyrpszuzhtService;

    public UyrpszuzhtController(UyrpszuzhtService uyrpszuzhtService) {
        this.uyrpszuzhtService = uyrpszuzhtService;
    }

    @RequestMapping("/uyrpszuzht")
    public String index() {
        return uyrpszuzhtService.getGreeting();
    }

}
