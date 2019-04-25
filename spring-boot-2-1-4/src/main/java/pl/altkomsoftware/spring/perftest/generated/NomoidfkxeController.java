package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class NomoidfkxeController {

    private final NomoidfkxeService nomoidfkxeService;

    public NomoidfkxeController(NomoidfkxeService nomoidfkxeService) {
        this.nomoidfkxeService = nomoidfkxeService;
    }

    @RequestMapping("/nomoidfkxe")
    public String index() {
        return nomoidfkxeService.getGreeting();
    }

}
