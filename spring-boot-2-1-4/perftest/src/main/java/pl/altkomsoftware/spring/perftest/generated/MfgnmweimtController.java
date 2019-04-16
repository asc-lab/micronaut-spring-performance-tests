package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MfgnmweimtController {

    private final MfgnmweimtService mfgnmweimtService;

    public MfgnmweimtController(MfgnmweimtService mfgnmweimtService) {
        this.mfgnmweimtService = mfgnmweimtService;
    }

    @RequestMapping("/mfgnmweimt")
    public String index() {
        return mfgnmweimtService.getGreeting();
    }

}
