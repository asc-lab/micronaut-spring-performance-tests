package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class LeiqqwjvouController {

    private final LeiqqwjvouService leiqqwjvouService;

    public LeiqqwjvouController(LeiqqwjvouService leiqqwjvouService) {
        this.leiqqwjvouService = leiqqwjvouService;
    }

    @RequestMapping("/leiqqwjvou")
    public String index() {
        return leiqqwjvouService.getGreeting();
    }

}
