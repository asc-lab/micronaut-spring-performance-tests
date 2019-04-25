package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class VmrlproajpController {

    private final VmrlproajpService vmrlproajpService;

    public VmrlproajpController(VmrlproajpService vmrlproajpService) {
        this.vmrlproajpService = vmrlproajpService;
    }

    @RequestMapping("/vmrlproajp")
    public String index() {
        return vmrlproajpService.getGreeting();
    }

}
