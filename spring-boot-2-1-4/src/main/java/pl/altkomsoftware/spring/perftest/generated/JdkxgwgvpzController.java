package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class JdkxgwgvpzController {

    private final JdkxgwgvpzService jdkxgwgvpzService;

    public JdkxgwgvpzController(JdkxgwgvpzService jdkxgwgvpzService) {
        this.jdkxgwgvpzService = jdkxgwgvpzService;
    }

    @RequestMapping("/jdkxgwgvpz")
    public String index() {
        return jdkxgwgvpzService.getGreeting();
    }

}
