package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class VqranersuwController {

    private final VqranersuwService vqranersuwService;

    public VqranersuwController(VqranersuwService vqranersuwService) {
        this.vqranersuwService = vqranersuwService;
    }

    @RequestMapping("/vqranersuw")
    public String index() {
        return vqranersuwService.getGreeting();
    }

}
