package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class EhjmmasaerController {

    private final EhjmmasaerService ehjmmasaerService;

    public EhjmmasaerController(EhjmmasaerService ehjmmasaerService) {
        this.ehjmmasaerService = ehjmmasaerService;
    }

    @RequestMapping("/ehjmmasaer")
    public String index() {
        return ehjmmasaerService.getGreeting();
    }

}
