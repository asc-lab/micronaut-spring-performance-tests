package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class UcfcjmrwfhController {

    private final UcfcjmrwfhService ucfcjmrwfhService;

    public UcfcjmrwfhController(UcfcjmrwfhService ucfcjmrwfhService) {
        this.ucfcjmrwfhService = ucfcjmrwfhService;
    }

    @RequestMapping("/ucfcjmrwfh")
    public String index() {
        return ucfcjmrwfhService.getGreeting();
    }

}
