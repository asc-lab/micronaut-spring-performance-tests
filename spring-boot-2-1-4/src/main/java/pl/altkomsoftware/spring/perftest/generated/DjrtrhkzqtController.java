package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DjrtrhkzqtController {

    private final DjrtrhkzqtService djrtrhkzqtService;

    public DjrtrhkzqtController(DjrtrhkzqtService djrtrhkzqtService) {
        this.djrtrhkzqtService = djrtrhkzqtService;
    }

    @RequestMapping("/djrtrhkzqt")
    public String index() {
        return djrtrhkzqtService.getGreeting();
    }

}
