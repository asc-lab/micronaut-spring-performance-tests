package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class VbhhnhuktzController {

    private final VbhhnhuktzService vbhhnhuktzService;

    public VbhhnhuktzController(VbhhnhuktzService vbhhnhuktzService) {
        this.vbhhnhuktzService = vbhhnhuktzService;
    }

    @RequestMapping("/vbhhnhuktz")
    public String index() {
        return vbhhnhuktzService.getGreeting();
    }

}
