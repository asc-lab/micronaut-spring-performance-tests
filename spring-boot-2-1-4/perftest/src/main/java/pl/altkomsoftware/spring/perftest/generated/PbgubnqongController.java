package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class PbgubnqongController {

    private final PbgubnqongService pbgubnqongService;

    public PbgubnqongController(PbgubnqongService pbgubnqongService) {
        this.pbgubnqongService = pbgubnqongService;
    }

    @RequestMapping("/pbgubnqong")
    public String index() {
        return pbgubnqongService.getGreeting();
    }

}
