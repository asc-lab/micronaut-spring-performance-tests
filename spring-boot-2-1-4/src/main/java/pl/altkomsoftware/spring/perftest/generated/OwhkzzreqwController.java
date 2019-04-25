package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class OwhkzzreqwController {

    private final OwhkzzreqwService owhkzzreqwService;

    public OwhkzzreqwController(OwhkzzreqwService owhkzzreqwService) {
        this.owhkzzreqwService = owhkzzreqwService;
    }

    @RequestMapping("/owhkzzreqw")
    public String index() {
        return owhkzzreqwService.getGreeting();
    }

}
