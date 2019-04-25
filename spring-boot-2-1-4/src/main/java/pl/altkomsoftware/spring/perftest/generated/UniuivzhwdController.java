package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class UniuivzhwdController {

    private final UniuivzhwdService uniuivzhwdService;

    public UniuivzhwdController(UniuivzhwdService uniuivzhwdService) {
        this.uniuivzhwdService = uniuivzhwdService;
    }

    @RequestMapping("/uniuivzhwd")
    public String index() {
        return uniuivzhwdService.getGreeting();
    }

}
