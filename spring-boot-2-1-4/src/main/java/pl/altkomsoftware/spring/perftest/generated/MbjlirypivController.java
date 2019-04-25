package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MbjlirypivController {

    private final MbjlirypivService mbjlirypivService;

    public MbjlirypivController(MbjlirypivService mbjlirypivService) {
        this.mbjlirypivService = mbjlirypivService;
    }

    @RequestMapping("/mbjlirypiv")
    public String index() {
        return mbjlirypivService.getGreeting();
    }

}
