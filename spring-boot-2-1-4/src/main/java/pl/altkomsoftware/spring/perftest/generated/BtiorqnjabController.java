package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class BtiorqnjabController {

    private final BtiorqnjabService btiorqnjabService;

    public BtiorqnjabController(BtiorqnjabService btiorqnjabService) {
        this.btiorqnjabService = btiorqnjabService;
    }

    @RequestMapping("/btiorqnjab")
    public String index() {
        return btiorqnjabService.getGreeting();
    }

}
