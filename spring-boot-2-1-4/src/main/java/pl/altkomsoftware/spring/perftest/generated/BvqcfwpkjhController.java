package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class BvqcfwpkjhController {

    private final BvqcfwpkjhService bvqcfwpkjhService;

    public BvqcfwpkjhController(BvqcfwpkjhService bvqcfwpkjhService) {
        this.bvqcfwpkjhService = bvqcfwpkjhService;
    }

    @RequestMapping("/bvqcfwpkjh")
    public String index() {
        return bvqcfwpkjhService.getGreeting();
    }

}
