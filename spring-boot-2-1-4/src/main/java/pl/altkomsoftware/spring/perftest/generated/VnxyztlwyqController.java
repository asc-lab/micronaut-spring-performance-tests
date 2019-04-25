package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class VnxyztlwyqController {

    private final VnxyztlwyqService vnxyztlwyqService;

    public VnxyztlwyqController(VnxyztlwyqService vnxyztlwyqService) {
        this.vnxyztlwyqService = vnxyztlwyqService;
    }

    @RequestMapping("/vnxyztlwyq")
    public String index() {
        return vnxyztlwyqService.getGreeting();
    }

}
