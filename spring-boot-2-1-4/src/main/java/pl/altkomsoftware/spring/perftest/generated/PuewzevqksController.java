package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class PuewzevqksController {

    private final PuewzevqksService puewzevqksService;

    public PuewzevqksController(PuewzevqksService puewzevqksService) {
        this.puewzevqksService = puewzevqksService;
    }

    @RequestMapping("/puewzevqks")
    public String index() {
        return puewzevqksService.getGreeting();
    }

}
