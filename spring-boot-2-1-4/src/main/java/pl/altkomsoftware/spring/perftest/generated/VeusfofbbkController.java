package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class VeusfofbbkController {

    private final VeusfofbbkService veusfofbbkService;

    public VeusfofbbkController(VeusfofbbkService veusfofbbkService) {
        this.veusfofbbkService = veusfofbbkService;
    }

    @RequestMapping("/veusfofbbk")
    public String index() {
        return veusfofbbkService.getGreeting();
    }

}
