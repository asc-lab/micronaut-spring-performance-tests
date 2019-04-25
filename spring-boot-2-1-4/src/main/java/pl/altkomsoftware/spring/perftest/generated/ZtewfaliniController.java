package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ZtewfaliniController {

    private final ZtewfaliniService ztewfaliniService;

    public ZtewfaliniController(ZtewfaliniService ztewfaliniService) {
        this.ztewfaliniService = ztewfaliniService;
    }

    @RequestMapping("/ztewfalini")
    public String index() {
        return ztewfaliniService.getGreeting();
    }

}
