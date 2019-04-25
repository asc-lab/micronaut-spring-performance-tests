package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class JqbcrfznqaController {

    private final JqbcrfznqaService jqbcrfznqaService;

    public JqbcrfznqaController(JqbcrfznqaService jqbcrfznqaService) {
        this.jqbcrfznqaService = jqbcrfznqaService;
    }

    @RequestMapping("/jqbcrfznqa")
    public String index() {
        return jqbcrfznqaService.getGreeting();
    }

}
