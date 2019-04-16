package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ViciodvrmuController {

    private final ViciodvrmuService viciodvrmuService;

    public ViciodvrmuController(ViciodvrmuService viciodvrmuService) {
        this.viciodvrmuService = viciodvrmuService;
    }

    @RequestMapping("/viciodvrmu")
    public String index() {
        return viciodvrmuService.getGreeting();
    }

}
