package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class LxtttqtnlnController {

    private final LxtttqtnlnService lxtttqtnlnService;

    public LxtttqtnlnController(LxtttqtnlnService lxtttqtnlnService) {
        this.lxtttqtnlnService = lxtttqtnlnService;
    }

    @RequestMapping("/lxtttqtnln")
    public String index() {
        return lxtttqtnlnService.getGreeting();
    }

}
