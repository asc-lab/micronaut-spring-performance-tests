package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DzxfrqmgkwController {

    private final DzxfrqmgkwService dzxfrqmgkwService;

    public DzxfrqmgkwController(DzxfrqmgkwService dzxfrqmgkwService) {
        this.dzxfrqmgkwService = dzxfrqmgkwService;
    }

    @RequestMapping("/dzxfrqmgkw")
    public String index() {
        return dzxfrqmgkwService.getGreeting();
    }

}
