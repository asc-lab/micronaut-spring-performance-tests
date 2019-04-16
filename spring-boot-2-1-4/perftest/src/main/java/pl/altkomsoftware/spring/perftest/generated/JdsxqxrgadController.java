package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class JdsxqxrgadController {

    private final JdsxqxrgadService jdsxqxrgadService;

    public JdsxqxrgadController(JdsxqxrgadService jdsxqxrgadService) {
        this.jdsxqxrgadService = jdsxqxrgadService;
    }

    @RequestMapping("/jdsxqxrgad")
    public String index() {
        return jdsxqxrgadService.getGreeting();
    }

}
