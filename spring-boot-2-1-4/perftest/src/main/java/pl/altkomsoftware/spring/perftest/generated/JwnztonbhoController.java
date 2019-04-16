package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class JwnztonbhoController {

    private final JwnztonbhoService jwnztonbhoService;

    public JwnztonbhoController(JwnztonbhoService jwnztonbhoService) {
        this.jwnztonbhoService = jwnztonbhoService;
    }

    @RequestMapping("/jwnztonbho")
    public String index() {
        return jwnztonbhoService.getGreeting();
    }

}
