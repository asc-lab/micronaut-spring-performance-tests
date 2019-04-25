package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class BxxvyiassaController {

    private final BxxvyiassaService bxxvyiassaService;

    public BxxvyiassaController(BxxvyiassaService bxxvyiassaService) {
        this.bxxvyiassaService = bxxvyiassaService;
    }

    @RequestMapping("/bxxvyiassa")
    public String index() {
        return bxxvyiassaService.getGreeting();
    }

}
