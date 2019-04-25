package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class IthaoeauzwController {

    private final IthaoeauzwService ithaoeauzwService;

    public IthaoeauzwController(IthaoeauzwService ithaoeauzwService) {
        this.ithaoeauzwService = ithaoeauzwService;
    }

    @RequestMapping("/ithaoeauzw")
    public String index() {
        return ithaoeauzwService.getGreeting();
    }

}
