package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class VqoqkbgihxController {

    private final VqoqkbgihxService vqoqkbgihxService;

    public VqoqkbgihxController(VqoqkbgihxService vqoqkbgihxService) {
        this.vqoqkbgihxService = vqoqkbgihxService;
    }

    @RequestMapping("/vqoqkbgihx")
    public String index() {
        return vqoqkbgihxService.getGreeting();
    }

}
