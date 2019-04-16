package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class KcaudanbozController {

    private final KcaudanbozService kcaudanbozService;

    public KcaudanbozController(KcaudanbozService kcaudanbozService) {
        this.kcaudanbozService = kcaudanbozService;
    }

    @RequestMapping("/kcaudanboz")
    public String index() {
        return kcaudanbozService.getGreeting();
    }

}
