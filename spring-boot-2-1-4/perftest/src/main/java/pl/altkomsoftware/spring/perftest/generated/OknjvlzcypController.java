package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class OknjvlzcypController {

    private final OknjvlzcypService oknjvlzcypService;

    public OknjvlzcypController(OknjvlzcypService oknjvlzcypService) {
        this.oknjvlzcypService = oknjvlzcypService;
    }

    @RequestMapping("/oknjvlzcyp")
    public String index() {
        return oknjvlzcypService.getGreeting();
    }

}
