package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class VtvrimatlkController {

    private final VtvrimatlkService vtvrimatlkService;

    public VtvrimatlkController(VtvrimatlkService vtvrimatlkService) {
        this.vtvrimatlkService = vtvrimatlkService;
    }

    @RequestMapping("/vtvrimatlk")
    public String index() {
        return vtvrimatlkService.getGreeting();
    }

}
