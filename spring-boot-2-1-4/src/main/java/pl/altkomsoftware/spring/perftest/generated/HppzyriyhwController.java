package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HppzyriyhwController {

    private final HppzyriyhwService hppzyriyhwService;

    public HppzyriyhwController(HppzyriyhwService hppzyriyhwService) {
        this.hppzyriyhwService = hppzyriyhwService;
    }

    @RequestMapping("/hppzyriyhw")
    public String index() {
        return hppzyriyhwService.getGreeting();
    }

}
