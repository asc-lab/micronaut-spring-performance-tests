package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class JoauhgbujaController {

    private final JoauhgbujaService joauhgbujaService;

    public JoauhgbujaController(JoauhgbujaService joauhgbujaService) {
        this.joauhgbujaService = joauhgbujaService;
    }

    @RequestMapping("/joauhgbuja")
    public String index() {
        return joauhgbujaService.getGreeting();
    }

}
