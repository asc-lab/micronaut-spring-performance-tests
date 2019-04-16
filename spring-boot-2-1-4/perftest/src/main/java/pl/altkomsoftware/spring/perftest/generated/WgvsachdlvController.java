package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class WgvsachdlvController {

    private final WgvsachdlvService wgvsachdlvService;

    public WgvsachdlvController(WgvsachdlvService wgvsachdlvService) {
        this.wgvsachdlvService = wgvsachdlvService;
    }

    @RequestMapping("/wgvsachdlv")
    public String index() {
        return wgvsachdlvService.getGreeting();
    }

}
