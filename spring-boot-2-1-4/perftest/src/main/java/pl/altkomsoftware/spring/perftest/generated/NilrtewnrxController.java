package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class NilrtewnrxController {

    private final NilrtewnrxService nilrtewnrxService;

    public NilrtewnrxController(NilrtewnrxService nilrtewnrxService) {
        this.nilrtewnrxService = nilrtewnrxService;
    }

    @RequestMapping("/nilrtewnrx")
    public String index() {
        return nilrtewnrxService.getGreeting();
    }

}
