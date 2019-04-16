package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MvldwfisouController {

    private final MvldwfisouService mvldwfisouService;

    public MvldwfisouController(MvldwfisouService mvldwfisouService) {
        this.mvldwfisouService = mvldwfisouService;
    }

    @RequestMapping("/mvldwfisou")
    public String index() {
        return mvldwfisouService.getGreeting();
    }

}
