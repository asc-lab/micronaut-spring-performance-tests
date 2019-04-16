package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CrayttvjheController {

    private final CrayttvjheService crayttvjheService;

    public CrayttvjheController(CrayttvjheService crayttvjheService) {
        this.crayttvjheService = crayttvjheService;
    }

    @RequestMapping("/crayttvjhe")
    public String index() {
        return crayttvjheService.getGreeting();
    }

}
