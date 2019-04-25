package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class JvgulgnnezController {

    private final JvgulgnnezService jvgulgnnezService;

    public JvgulgnnezController(JvgulgnnezService jvgulgnnezService) {
        this.jvgulgnnezService = jvgulgnnezService;
    }

    @RequestMapping("/jvgulgnnez")
    public String index() {
        return jvgulgnnezService.getGreeting();
    }

}
