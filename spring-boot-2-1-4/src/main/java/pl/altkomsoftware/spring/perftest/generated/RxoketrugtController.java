package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class RxoketrugtController {

    private final RxoketrugtService rxoketrugtService;

    public RxoketrugtController(RxoketrugtService rxoketrugtService) {
        this.rxoketrugtService = rxoketrugtService;
    }

    @RequestMapping("/rxoketrugt")
    public String index() {
        return rxoketrugtService.getGreeting();
    }

}
