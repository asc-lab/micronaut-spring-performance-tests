package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MwbhpehkzfController {

    private final MwbhpehkzfService mwbhpehkzfService;

    public MwbhpehkzfController(MwbhpehkzfService mwbhpehkzfService) {
        this.mwbhpehkzfService = mwbhpehkzfService;
    }

    @RequestMapping("/mwbhpehkzf")
    public String index() {
        return mwbhpehkzfService.getGreeting();
    }

}
