package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DkkfgoboglController {

    private final DkkfgoboglService dkkfgoboglService;

    public DkkfgoboglController(DkkfgoboglService dkkfgoboglService) {
        this.dkkfgoboglService = dkkfgoboglService;
    }

    @RequestMapping("/dkkfgobogl")
    public String index() {
        return dkkfgoboglService.getGreeting();
    }

}
