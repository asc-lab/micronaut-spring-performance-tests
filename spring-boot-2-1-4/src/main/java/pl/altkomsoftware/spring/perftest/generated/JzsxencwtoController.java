package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class JzsxencwtoController {

    private final JzsxencwtoService jzsxencwtoService;

    public JzsxencwtoController(JzsxencwtoService jzsxencwtoService) {
        this.jzsxencwtoService = jzsxencwtoService;
    }

    @RequestMapping("/jzsxencwto")
    public String index() {
        return jzsxencwtoService.getGreeting();
    }

}
