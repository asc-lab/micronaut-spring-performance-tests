package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class TritzwywqtController {

    private final TritzwywqtService tritzwywqtService;

    public TritzwywqtController(TritzwywqtService tritzwywqtService) {
        this.tritzwywqtService = tritzwywqtService;
    }

    @RequestMapping("/tritzwywqt")
    public String index() {
        return tritzwywqtService.getGreeting();
    }

}
