package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ClqkpldirmController {

    private final ClqkpldirmService clqkpldirmService;

    public ClqkpldirmController(ClqkpldirmService clqkpldirmService) {
        this.clqkpldirmService = clqkpldirmService;
    }

    @RequestMapping("/clqkpldirm")
    public String index() {
        return clqkpldirmService.getGreeting();
    }

}
