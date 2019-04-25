package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class BtdtzsszgkController {

    private final BtdtzsszgkService btdtzsszgkService;

    public BtdtzsszgkController(BtdtzsszgkService btdtzsszgkService) {
        this.btdtzsszgkService = btdtzsszgkService;
    }

    @RequestMapping("/btdtzsszgk")
    public String index() {
        return btdtzsszgkService.getGreeting();
    }

}
