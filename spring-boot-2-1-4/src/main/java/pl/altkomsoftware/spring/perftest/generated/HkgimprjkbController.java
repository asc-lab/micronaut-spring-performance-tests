package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HkgimprjkbController {

    private final HkgimprjkbService hkgimprjkbService;

    public HkgimprjkbController(HkgimprjkbService hkgimprjkbService) {
        this.hkgimprjkbService = hkgimprjkbService;
    }

    @RequestMapping("/hkgimprjkb")
    public String index() {
        return hkgimprjkbService.getGreeting();
    }

}
