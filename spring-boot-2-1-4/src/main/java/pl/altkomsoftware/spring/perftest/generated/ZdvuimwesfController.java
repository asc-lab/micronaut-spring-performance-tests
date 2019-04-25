package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ZdvuimwesfController {

    private final ZdvuimwesfService zdvuimwesfService;

    public ZdvuimwesfController(ZdvuimwesfService zdvuimwesfService) {
        this.zdvuimwesfService = zdvuimwesfService;
    }

    @RequestMapping("/zdvuimwesf")
    public String index() {
        return zdvuimwesfService.getGreeting();
    }

}
