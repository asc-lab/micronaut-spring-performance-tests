package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DenpwjyfzfController {

    private final DenpwjyfzfService denpwjyfzfService;

    public DenpwjyfzfController(DenpwjyfzfService denpwjyfzfService) {
        this.denpwjyfzfService = denpwjyfzfService;
    }

    @RequestMapping("/denpwjyfzf")
    public String index() {
        return denpwjyfzfService.getGreeting();
    }

}
