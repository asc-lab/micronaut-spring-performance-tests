package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class OzphecvphbController {

    private final OzphecvphbService ozphecvphbService;

    public OzphecvphbController(OzphecvphbService ozphecvphbService) {
        this.ozphecvphbService = ozphecvphbService;
    }

    @RequestMapping("/ozphecvphb")
    public String index() {
        return ozphecvphbService.getGreeting();
    }

}
