package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class UurqwknhkkController {

    private final UurqwknhkkService uurqwknhkkService;

    public UurqwknhkkController(UurqwknhkkService uurqwknhkkService) {
        this.uurqwknhkkService = uurqwknhkkService;
    }

    @RequestMapping("/uurqwknhkk")
    public String index() {
        return uurqwknhkkService.getGreeting();
    }

}
