package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class BlesoqbjkmController {

    private final BlesoqbjkmService blesoqbjkmService;

    public BlesoqbjkmController(BlesoqbjkmService blesoqbjkmService) {
        this.blesoqbjkmService = blesoqbjkmService;
    }

    @RequestMapping("/blesoqbjkm")
    public String index() {
        return blesoqbjkmService.getGreeting();
    }

}
