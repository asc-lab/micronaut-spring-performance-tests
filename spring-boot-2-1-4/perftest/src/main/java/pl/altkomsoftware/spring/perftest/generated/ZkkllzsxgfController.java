package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ZkkllzsxgfController {

    private final ZkkllzsxgfService zkkllzsxgfService;

    public ZkkllzsxgfController(ZkkllzsxgfService zkkllzsxgfService) {
        this.zkkllzsxgfService = zkkllzsxgfService;
    }

    @RequestMapping("/zkkllzsxgf")
    public String index() {
        return zkkllzsxgfService.getGreeting();
    }

}
