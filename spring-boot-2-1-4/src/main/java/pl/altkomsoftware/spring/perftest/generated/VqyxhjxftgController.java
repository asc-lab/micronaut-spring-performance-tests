package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class VqyxhjxftgController {

    private final VqyxhjxftgService vqyxhjxftgService;

    public VqyxhjxftgController(VqyxhjxftgService vqyxhjxftgService) {
        this.vqyxhjxftgService = vqyxhjxftgService;
    }

    @RequestMapping("/vqyxhjxftg")
    public String index() {
        return vqyxhjxftgService.getGreeting();
    }

}
