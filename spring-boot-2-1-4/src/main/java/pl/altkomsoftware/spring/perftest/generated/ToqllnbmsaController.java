package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ToqllnbmsaController {

    private final ToqllnbmsaService toqllnbmsaService;

    public ToqllnbmsaController(ToqllnbmsaService toqllnbmsaService) {
        this.toqllnbmsaService = toqllnbmsaService;
    }

    @RequestMapping("/toqllnbmsa")
    public String index() {
        return toqllnbmsaService.getGreeting();
    }

}
