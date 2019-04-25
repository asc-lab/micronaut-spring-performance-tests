package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class NspcoddemhController {

    private final NspcoddemhService nspcoddemhService;

    public NspcoddemhController(NspcoddemhService nspcoddemhService) {
        this.nspcoddemhService = nspcoddemhService;
    }

    @RequestMapping("/nspcoddemh")
    public String index() {
        return nspcoddemhService.getGreeting();
    }

}
