package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SfwxsjrtavController {

    private final SfwxsjrtavService sfwxsjrtavService;

    public SfwxsjrtavController(SfwxsjrtavService sfwxsjrtavService) {
        this.sfwxsjrtavService = sfwxsjrtavService;
    }

    @RequestMapping("/sfwxsjrtav")
    public String index() {
        return sfwxsjrtavService.getGreeting();
    }

}
