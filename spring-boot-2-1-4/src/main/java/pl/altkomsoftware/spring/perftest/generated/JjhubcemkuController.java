package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class JjhubcemkuController {

    private final JjhubcemkuService jjhubcemkuService;

    public JjhubcemkuController(JjhubcemkuService jjhubcemkuService) {
        this.jjhubcemkuService = jjhubcemkuService;
    }

    @RequestMapping("/jjhubcemku")
    public String index() {
        return jjhubcemkuService.getGreeting();
    }

}
