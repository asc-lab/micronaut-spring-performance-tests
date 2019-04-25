package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MnpvdvwiibController {

    private final MnpvdvwiibService mnpvdvwiibService;

    public MnpvdvwiibController(MnpvdvwiibService mnpvdvwiibService) {
        this.mnpvdvwiibService = mnpvdvwiibService;
    }

    @RequestMapping("/mnpvdvwiib")
    public String index() {
        return mnpvdvwiibService.getGreeting();
    }

}
