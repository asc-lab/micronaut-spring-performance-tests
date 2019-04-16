package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DwejzwwrqcController {

    private final DwejzwwrqcService dwejzwwrqcService;

    public DwejzwwrqcController(DwejzwwrqcService dwejzwwrqcService) {
        this.dwejzwwrqcService = dwejzwwrqcService;
    }

    @RequestMapping("/dwejzwwrqc")
    public String index() {
        return dwejzwwrqcService.getGreeting();
    }

}
