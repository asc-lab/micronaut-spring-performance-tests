package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class KdeddhaozkController {

    private final KdeddhaozkService kdeddhaozkService;

    public KdeddhaozkController(KdeddhaozkService kdeddhaozkService) {
        this.kdeddhaozkService = kdeddhaozkService;
    }

    @RequestMapping("/kdeddhaozk")
    public String index() {
        return kdeddhaozkService.getGreeting();
    }

}
