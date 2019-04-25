package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class FsjpgfxvrsController {

    private final FsjpgfxvrsService fsjpgfxvrsService;

    public FsjpgfxvrsController(FsjpgfxvrsService fsjpgfxvrsService) {
        this.fsjpgfxvrsService = fsjpgfxvrsService;
    }

    @RequestMapping("/fsjpgfxvrs")
    public String index() {
        return fsjpgfxvrsService.getGreeting();
    }

}
