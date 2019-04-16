package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class IqsdgtghrfController {

    private final IqsdgtghrfService iqsdgtghrfService;

    public IqsdgtghrfController(IqsdgtghrfService iqsdgtghrfService) {
        this.iqsdgtghrfService = iqsdgtghrfService;
    }

    @RequestMapping("/iqsdgtghrf")
    public String index() {
        return iqsdgtghrfService.getGreeting();
    }

}
