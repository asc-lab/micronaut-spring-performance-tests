package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class EaixynqqtnController {

    private final EaixynqqtnService eaixynqqtnService;

    public EaixynqqtnController(EaixynqqtnService eaixynqqtnService) {
        this.eaixynqqtnService = eaixynqqtnService;
    }

    @RequestMapping("/eaixynqqtn")
    public String index() {
        return eaixynqqtnService.getGreeting();
    }

}
