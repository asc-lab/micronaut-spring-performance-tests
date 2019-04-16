package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MaczscdbusController {

    private final MaczscdbusService maczscdbusService;

    public MaczscdbusController(MaczscdbusService maczscdbusService) {
        this.maczscdbusService = maczscdbusService;
    }

    @RequestMapping("/maczscdbus")
    public String index() {
        return maczscdbusService.getGreeting();
    }

}
