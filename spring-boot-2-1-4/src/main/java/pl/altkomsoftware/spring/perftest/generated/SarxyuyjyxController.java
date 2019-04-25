package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SarxyuyjyxController {

    private final SarxyuyjyxService sarxyuyjyxService;

    public SarxyuyjyxController(SarxyuyjyxService sarxyuyjyxService) {
        this.sarxyuyjyxService = sarxyuyjyxService;
    }

    @RequestMapping("/sarxyuyjyx")
    public String index() {
        return sarxyuyjyxService.getGreeting();
    }

}
