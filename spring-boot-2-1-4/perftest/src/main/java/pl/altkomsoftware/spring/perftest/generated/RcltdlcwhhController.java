package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class RcltdlcwhhController {

    private final RcltdlcwhhService rcltdlcwhhService;

    public RcltdlcwhhController(RcltdlcwhhService rcltdlcwhhService) {
        this.rcltdlcwhhService = rcltdlcwhhService;
    }

    @RequestMapping("/rcltdlcwhh")
    public String index() {
        return rcltdlcwhhService.getGreeting();
    }

}
