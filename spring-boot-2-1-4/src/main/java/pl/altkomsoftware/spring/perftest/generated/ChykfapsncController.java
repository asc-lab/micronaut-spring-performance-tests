package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ChykfapsncController {

    private final ChykfapsncService chykfapsncService;

    public ChykfapsncController(ChykfapsncService chykfapsncService) {
        this.chykfapsncService = chykfapsncService;
    }

    @RequestMapping("/chykfapsnc")
    public String index() {
        return chykfapsncService.getGreeting();
    }

}
