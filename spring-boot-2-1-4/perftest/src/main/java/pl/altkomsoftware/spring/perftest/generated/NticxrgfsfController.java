package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class NticxrgfsfController {

    private final NticxrgfsfService nticxrgfsfService;

    public NticxrgfsfController(NticxrgfsfService nticxrgfsfService) {
        this.nticxrgfsfService = nticxrgfsfService;
    }

    @RequestMapping("/nticxrgfsf")
    public String index() {
        return nticxrgfsfService.getGreeting();
    }

}
