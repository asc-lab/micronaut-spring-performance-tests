package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class AbpayxixibController {

    private final AbpayxixibService abpayxixibService;

    public AbpayxixibController(AbpayxixibService abpayxixibService) {
        this.abpayxixibService = abpayxixibService;
    }

    @RequestMapping("/abpayxixib")
    public String index() {
        return abpayxixibService.getGreeting();
    }

}
