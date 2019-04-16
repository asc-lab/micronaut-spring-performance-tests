package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class EbmlhimetgController {

    private final EbmlhimetgService ebmlhimetgService;

    public EbmlhimetgController(EbmlhimetgService ebmlhimetgService) {
        this.ebmlhimetgService = ebmlhimetgService;
    }

    @RequestMapping("/ebmlhimetg")
    public String index() {
        return ebmlhimetgService.getGreeting();
    }

}
