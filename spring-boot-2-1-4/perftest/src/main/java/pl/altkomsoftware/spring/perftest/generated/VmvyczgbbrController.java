package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class VmvyczgbbrController {

    private final VmvyczgbbrService vmvyczgbbrService;

    public VmvyczgbbrController(VmvyczgbbrService vmvyczgbbrService) {
        this.vmvyczgbbrService = vmvyczgbbrService;
    }

    @RequestMapping("/vmvyczgbbr")
    public String index() {
        return vmvyczgbbrService.getGreeting();
    }

}
