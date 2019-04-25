package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MloasulqduController {

    private final MloasulqduService mloasulqduService;

    public MloasulqduController(MloasulqduService mloasulqduService) {
        this.mloasulqduService = mloasulqduService;
    }

    @RequestMapping("/mloasulqdu")
    public String index() {
        return mloasulqduService.getGreeting();
    }

}
