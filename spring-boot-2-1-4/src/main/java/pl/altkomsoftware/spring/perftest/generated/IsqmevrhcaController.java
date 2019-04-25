package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class IsqmevrhcaController {

    private final IsqmevrhcaService isqmevrhcaService;

    public IsqmevrhcaController(IsqmevrhcaService isqmevrhcaService) {
        this.isqmevrhcaService = isqmevrhcaService;
    }

    @RequestMapping("/isqmevrhca")
    public String index() {
        return isqmevrhcaService.getGreeting();
    }

}
