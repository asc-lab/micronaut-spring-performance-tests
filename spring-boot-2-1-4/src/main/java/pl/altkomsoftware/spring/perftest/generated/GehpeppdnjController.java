package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class GehpeppdnjController {

    private final GehpeppdnjService gehpeppdnjService;

    public GehpeppdnjController(GehpeppdnjService gehpeppdnjService) {
        this.gehpeppdnjService = gehpeppdnjService;
    }

    @RequestMapping("/gehpeppdnj")
    public String index() {
        return gehpeppdnjService.getGreeting();
    }

}
