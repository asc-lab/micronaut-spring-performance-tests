package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HngkkcuiydController {

    private final HngkkcuiydService hngkkcuiydService;

    public HngkkcuiydController(HngkkcuiydService hngkkcuiydService) {
        this.hngkkcuiydService = hngkkcuiydService;
    }

    @RequestMapping("/hngkkcuiyd")
    public String index() {
        return hngkkcuiydService.getGreeting();
    }

}
