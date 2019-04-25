package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class TpauifgtinController {

    private final TpauifgtinService tpauifgtinService;

    public TpauifgtinController(TpauifgtinService tpauifgtinService) {
        this.tpauifgtinService = tpauifgtinService;
    }

    @RequestMapping("/tpauifgtin")
    public String index() {
        return tpauifgtinService.getGreeting();
    }

}
