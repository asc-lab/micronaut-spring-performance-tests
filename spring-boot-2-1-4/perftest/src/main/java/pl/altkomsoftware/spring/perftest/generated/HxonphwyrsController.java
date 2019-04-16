package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HxonphwyrsController {

    private final HxonphwyrsService hxonphwyrsService;

    public HxonphwyrsController(HxonphwyrsService hxonphwyrsService) {
        this.hxonphwyrsService = hxonphwyrsService;
    }

    @RequestMapping("/hxonphwyrs")
    public String index() {
        return hxonphwyrsService.getGreeting();
    }

}
