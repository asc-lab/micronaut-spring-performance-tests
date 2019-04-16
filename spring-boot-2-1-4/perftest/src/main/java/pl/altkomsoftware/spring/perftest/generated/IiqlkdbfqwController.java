package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class IiqlkdbfqwController {

    private final IiqlkdbfqwService iiqlkdbfqwService;

    public IiqlkdbfqwController(IiqlkdbfqwService iiqlkdbfqwService) {
        this.iiqlkdbfqwService = iiqlkdbfqwService;
    }

    @RequestMapping("/iiqlkdbfqw")
    public String index() {
        return iiqlkdbfqwService.getGreeting();
    }

}
