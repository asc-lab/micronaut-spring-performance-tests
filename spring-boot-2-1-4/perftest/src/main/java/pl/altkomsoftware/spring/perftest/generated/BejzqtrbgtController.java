package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class BejzqtrbgtController {

    private final BejzqtrbgtService bejzqtrbgtService;

    public BejzqtrbgtController(BejzqtrbgtService bejzqtrbgtService) {
        this.bejzqtrbgtService = bejzqtrbgtService;
    }

    @RequestMapping("/bejzqtrbgt")
    public String index() {
        return bejzqtrbgtService.getGreeting();
    }

}
