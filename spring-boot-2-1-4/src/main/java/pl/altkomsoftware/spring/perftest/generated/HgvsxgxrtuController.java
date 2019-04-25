package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HgvsxgxrtuController {

    private final HgvsxgxrtuService hgvsxgxrtuService;

    public HgvsxgxrtuController(HgvsxgxrtuService hgvsxgxrtuService) {
        this.hgvsxgxrtuService = hgvsxgxrtuService;
    }

    @RequestMapping("/hgvsxgxrtu")
    public String index() {
        return hgvsxgxrtuService.getGreeting();
    }

}
