package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class BvmepkkvpmController {

    private final BvmepkkvpmService bvmepkkvpmService;

    public BvmepkkvpmController(BvmepkkvpmService bvmepkkvpmService) {
        this.bvmepkkvpmService = bvmepkkvpmService;
    }

    @RequestMapping("/bvmepkkvpm")
    public String index() {
        return bvmepkkvpmService.getGreeting();
    }

}
