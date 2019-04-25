package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class JyjfuhchqcController {

    private final JyjfuhchqcService jyjfuhchqcService;

    public JyjfuhchqcController(JyjfuhchqcService jyjfuhchqcService) {
        this.jyjfuhchqcService = jyjfuhchqcService;
    }

    @RequestMapping("/jyjfuhchqc")
    public String index() {
        return jyjfuhchqcService.getGreeting();
    }

}
