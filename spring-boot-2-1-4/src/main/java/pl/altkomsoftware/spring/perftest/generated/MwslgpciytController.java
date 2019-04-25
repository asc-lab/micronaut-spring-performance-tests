package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MwslgpciytController {

    private final MwslgpciytService mwslgpciytService;

    public MwslgpciytController(MwslgpciytService mwslgpciytService) {
        this.mwslgpciytService = mwslgpciytService;
    }

    @RequestMapping("/mwslgpciyt")
    public String index() {
        return mwslgpciytService.getGreeting();
    }

}
