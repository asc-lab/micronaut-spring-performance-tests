package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CopaoennofController {

    private final CopaoennofService copaoennofService;

    public CopaoennofController(CopaoennofService copaoennofService) {
        this.copaoennofService = copaoennofService;
    }

    @RequestMapping("/copaoennof")
    public String index() {
        return copaoennofService.getGreeting();
    }

}
