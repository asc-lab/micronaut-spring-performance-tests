package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class EmynwcbehcController {

    private final EmynwcbehcService emynwcbehcService;

    public EmynwcbehcController(EmynwcbehcService emynwcbehcService) {
        this.emynwcbehcService = emynwcbehcService;
    }

    @RequestMapping("/emynwcbehc")
    public String index() {
        return emynwcbehcService.getGreeting();
    }

}
