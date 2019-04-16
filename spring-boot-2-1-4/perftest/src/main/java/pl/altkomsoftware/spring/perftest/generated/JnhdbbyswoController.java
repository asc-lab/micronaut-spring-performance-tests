package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class JnhdbbyswoController {

    private final JnhdbbyswoService jnhdbbyswoService;

    public JnhdbbyswoController(JnhdbbyswoService jnhdbbyswoService) {
        this.jnhdbbyswoService = jnhdbbyswoService;
    }

    @RequestMapping("/jnhdbbyswo")
    public String index() {
        return jnhdbbyswoService.getGreeting();
    }

}
