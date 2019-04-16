package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class OvmwjcohpqController {

    private final OvmwjcohpqService ovmwjcohpqService;

    public OvmwjcohpqController(OvmwjcohpqService ovmwjcohpqService) {
        this.ovmwjcohpqService = ovmwjcohpqService;
    }

    @RequestMapping("/ovmwjcohpq")
    public String index() {
        return ovmwjcohpqService.getGreeting();
    }

}
