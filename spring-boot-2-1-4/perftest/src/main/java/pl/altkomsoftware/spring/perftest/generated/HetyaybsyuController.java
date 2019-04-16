package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HetyaybsyuController {

    private final HetyaybsyuService hetyaybsyuService;

    public HetyaybsyuController(HetyaybsyuService hetyaybsyuService) {
        this.hetyaybsyuService = hetyaybsyuService;
    }

    @RequestMapping("/hetyaybsyu")
    public String index() {
        return hetyaybsyuService.getGreeting();
    }

}
