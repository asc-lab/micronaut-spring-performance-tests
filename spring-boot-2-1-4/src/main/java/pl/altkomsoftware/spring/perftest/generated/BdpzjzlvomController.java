package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class BdpzjzlvomController {

    private final BdpzjzlvomService bdpzjzlvomService;

    public BdpzjzlvomController(BdpzjzlvomService bdpzjzlvomService) {
        this.bdpzjzlvomService = bdpzjzlvomService;
    }

    @RequestMapping("/bdpzjzlvom")
    public String index() {
        return bdpzjzlvomService.getGreeting();
    }

}
