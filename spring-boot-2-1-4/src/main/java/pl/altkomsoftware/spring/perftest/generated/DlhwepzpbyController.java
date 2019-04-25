package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DlhwepzpbyController {

    private final DlhwepzpbyService dlhwepzpbyService;

    public DlhwepzpbyController(DlhwepzpbyService dlhwepzpbyService) {
        this.dlhwepzpbyService = dlhwepzpbyService;
    }

    @RequestMapping("/dlhwepzpby")
    public String index() {
        return dlhwepzpbyService.getGreeting();
    }

}
