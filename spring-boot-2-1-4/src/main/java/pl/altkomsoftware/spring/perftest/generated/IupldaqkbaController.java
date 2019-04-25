package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class IupldaqkbaController {

    private final IupldaqkbaService iupldaqkbaService;

    public IupldaqkbaController(IupldaqkbaService iupldaqkbaService) {
        this.iupldaqkbaService = iupldaqkbaService;
    }

    @RequestMapping("/iupldaqkba")
    public String index() {
        return iupldaqkbaService.getGreeting();
    }

}
