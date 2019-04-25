package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CulreuzhooController {

    private final CulreuzhooService culreuzhooService;

    public CulreuzhooController(CulreuzhooService culreuzhooService) {
        this.culreuzhooService = culreuzhooService;
    }

    @RequestMapping("/culreuzhoo")
    public String index() {
        return culreuzhooService.getGreeting();
    }

}
