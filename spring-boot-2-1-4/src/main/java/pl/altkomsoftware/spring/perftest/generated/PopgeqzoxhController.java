package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class PopgeqzoxhController {

    private final PopgeqzoxhService popgeqzoxhService;

    public PopgeqzoxhController(PopgeqzoxhService popgeqzoxhService) {
        this.popgeqzoxhService = popgeqzoxhService;
    }

    @RequestMapping("/popgeqzoxh")
    public String index() {
        return popgeqzoxhService.getGreeting();
    }

}
