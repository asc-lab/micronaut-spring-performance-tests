package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class TkqdmooevfController {

    private final TkqdmooevfService tkqdmooevfService;

    public TkqdmooevfController(TkqdmooevfService tkqdmooevfService) {
        this.tkqdmooevfService = tkqdmooevfService;
    }

    @RequestMapping("/tkqdmooevf")
    public String index() {
        return tkqdmooevfService.getGreeting();
    }

}
