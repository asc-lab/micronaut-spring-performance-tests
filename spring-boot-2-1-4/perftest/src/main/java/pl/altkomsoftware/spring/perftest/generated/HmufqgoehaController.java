package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HmufqgoehaController {

    private final HmufqgoehaService hmufqgoehaService;

    public HmufqgoehaController(HmufqgoehaService hmufqgoehaService) {
        this.hmufqgoehaService = hmufqgoehaService;
    }

    @RequestMapping("/hmufqgoeha")
    public String index() {
        return hmufqgoehaService.getGreeting();
    }

}
