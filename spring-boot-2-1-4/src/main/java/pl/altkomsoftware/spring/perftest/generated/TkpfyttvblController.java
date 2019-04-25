package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class TkpfyttvblController {

    private final TkpfyttvblService tkpfyttvblService;

    public TkpfyttvblController(TkpfyttvblService tkpfyttvblService) {
        this.tkpfyttvblService = tkpfyttvblService;
    }

    @RequestMapping("/tkpfyttvbl")
    public String index() {
        return tkpfyttvblService.getGreeting();
    }

}
