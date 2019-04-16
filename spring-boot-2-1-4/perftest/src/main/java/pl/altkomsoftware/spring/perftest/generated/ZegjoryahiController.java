package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ZegjoryahiController {

    private final ZegjoryahiService zegjoryahiService;

    public ZegjoryahiController(ZegjoryahiService zegjoryahiService) {
        this.zegjoryahiService = zegjoryahiService;
    }

    @RequestMapping("/zegjoryahi")
    public String index() {
        return zegjoryahiService.getGreeting();
    }

}
