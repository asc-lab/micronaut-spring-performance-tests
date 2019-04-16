package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class KiuuejbrqdController {

    private final KiuuejbrqdService kiuuejbrqdService;

    public KiuuejbrqdController(KiuuejbrqdService kiuuejbrqdService) {
        this.kiuuejbrqdService = kiuuejbrqdService;
    }

    @RequestMapping("/kiuuejbrqd")
    public String index() {
        return kiuuejbrqdService.getGreeting();
    }

}
