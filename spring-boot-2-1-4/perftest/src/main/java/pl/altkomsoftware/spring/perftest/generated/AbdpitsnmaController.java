package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class AbdpitsnmaController {

    private final AbdpitsnmaService abdpitsnmaService;

    public AbdpitsnmaController(AbdpitsnmaService abdpitsnmaService) {
        this.abdpitsnmaService = abdpitsnmaService;
    }

    @RequestMapping("/abdpitsnma")
    public String index() {
        return abdpitsnmaService.getGreeting();
    }

}
