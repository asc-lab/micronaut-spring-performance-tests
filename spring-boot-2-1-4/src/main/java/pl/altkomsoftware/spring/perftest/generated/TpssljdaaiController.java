package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class TpssljdaaiController {

    private final TpssljdaaiService tpssljdaaiService;

    public TpssljdaaiController(TpssljdaaiService tpssljdaaiService) {
        this.tpssljdaaiService = tpssljdaaiService;
    }

    @RequestMapping("/tpssljdaai")
    public String index() {
        return tpssljdaaiService.getGreeting();
    }

}
