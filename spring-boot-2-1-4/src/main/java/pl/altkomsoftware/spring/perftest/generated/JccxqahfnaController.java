package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class JccxqahfnaController {

    private final JccxqahfnaService jccxqahfnaService;

    public JccxqahfnaController(JccxqahfnaService jccxqahfnaService) {
        this.jccxqahfnaService = jccxqahfnaService;
    }

    @RequestMapping("/jccxqahfna")
    public String index() {
        return jccxqahfnaService.getGreeting();
    }

}
