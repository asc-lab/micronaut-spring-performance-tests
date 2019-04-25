package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class VyfhzfubtjController {

    private final VyfhzfubtjService vyfhzfubtjService;

    public VyfhzfubtjController(VyfhzfubtjService vyfhzfubtjService) {
        this.vyfhzfubtjService = vyfhzfubtjService;
    }

    @RequestMapping("/vyfhzfubtj")
    public String index() {
        return vyfhzfubtjService.getGreeting();
    }

}
