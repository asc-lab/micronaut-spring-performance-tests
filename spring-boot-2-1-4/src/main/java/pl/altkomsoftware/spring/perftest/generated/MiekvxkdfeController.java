package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MiekvxkdfeController {

    private final MiekvxkdfeService miekvxkdfeService;

    public MiekvxkdfeController(MiekvxkdfeService miekvxkdfeService) {
        this.miekvxkdfeService = miekvxkdfeService;
    }

    @RequestMapping("/miekvxkdfe")
    public String index() {
        return miekvxkdfeService.getGreeting();
    }

}
