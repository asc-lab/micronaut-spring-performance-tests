package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class JygatwulrhController {

    private final JygatwulrhService jygatwulrhService;

    public JygatwulrhController(JygatwulrhService jygatwulrhService) {
        this.jygatwulrhService = jygatwulrhService;
    }

    @RequestMapping("/jygatwulrh")
    public String index() {
        return jygatwulrhService.getGreeting();
    }

}
