package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class JvmoktnoxlController {

    private final JvmoktnoxlService jvmoktnoxlService;

    public JvmoktnoxlController(JvmoktnoxlService jvmoktnoxlService) {
        this.jvmoktnoxlService = jvmoktnoxlService;
    }

    @RequestMapping("/jvmoktnoxl")
    public String index() {
        return jvmoktnoxlService.getGreeting();
    }

}
