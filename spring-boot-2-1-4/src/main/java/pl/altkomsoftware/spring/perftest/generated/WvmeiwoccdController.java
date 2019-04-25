package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class WvmeiwoccdController {

    private final WvmeiwoccdService wvmeiwoccdService;

    public WvmeiwoccdController(WvmeiwoccdService wvmeiwoccdService) {
        this.wvmeiwoccdService = wvmeiwoccdService;
    }

    @RequestMapping("/wvmeiwoccd")
    public String index() {
        return wvmeiwoccdService.getGreeting();
    }

}
