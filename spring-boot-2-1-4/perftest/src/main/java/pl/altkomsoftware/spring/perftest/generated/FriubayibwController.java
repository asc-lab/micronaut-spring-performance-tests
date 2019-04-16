package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class FriubayibwController {

    private final FriubayibwService friubayibwService;

    public FriubayibwController(FriubayibwService friubayibwService) {
        this.friubayibwService = friubayibwService;
    }

    @RequestMapping("/friubayibw")
    public String index() {
        return friubayibwService.getGreeting();
    }

}
