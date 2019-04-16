package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class JqdqwyyvlcController {

    private final JqdqwyyvlcService jqdqwyyvlcService;

    public JqdqwyyvlcController(JqdqwyyvlcService jqdqwyyvlcService) {
        this.jqdqwyyvlcService = jqdqwyyvlcService;
    }

    @RequestMapping("/jqdqwyyvlc")
    public String index() {
        return jqdqwyyvlcService.getGreeting();
    }

}
