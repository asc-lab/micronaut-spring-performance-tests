package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class VqeolqnvecController {

    private final VqeolqnvecService vqeolqnvecService;

    public VqeolqnvecController(VqeolqnvecService vqeolqnvecService) {
        this.vqeolqnvecService = vqeolqnvecService;
    }

    @RequestMapping("/vqeolqnvec")
    public String index() {
        return vqeolqnvecService.getGreeting();
    }

}
