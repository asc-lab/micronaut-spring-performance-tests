package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class WauwjbowmpController {

    private final WauwjbowmpService wauwjbowmpService;

    public WauwjbowmpController(WauwjbowmpService wauwjbowmpService) {
        this.wauwjbowmpService = wauwjbowmpService;
    }

    @RequestMapping("/wauwjbowmp")
    public String index() {
        return wauwjbowmpService.getGreeting();
    }

}
