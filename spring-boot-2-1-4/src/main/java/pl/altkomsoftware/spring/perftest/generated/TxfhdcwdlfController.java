package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class TxfhdcwdlfController {

    private final TxfhdcwdlfService txfhdcwdlfService;

    public TxfhdcwdlfController(TxfhdcwdlfService txfhdcwdlfService) {
        this.txfhdcwdlfService = txfhdcwdlfService;
    }

    @RequestMapping("/txfhdcwdlf")
    public String index() {
        return txfhdcwdlfService.getGreeting();
    }

}
