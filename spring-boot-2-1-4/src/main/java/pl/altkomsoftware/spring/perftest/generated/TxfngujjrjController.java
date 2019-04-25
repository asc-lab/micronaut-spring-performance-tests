package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class TxfngujjrjController {

    private final TxfngujjrjService txfngujjrjService;

    public TxfngujjrjController(TxfngujjrjService txfngujjrjService) {
        this.txfngujjrjService = txfngujjrjService;
    }

    @RequestMapping("/txfngujjrj")
    public String index() {
        return txfngujjrjService.getGreeting();
    }

}
