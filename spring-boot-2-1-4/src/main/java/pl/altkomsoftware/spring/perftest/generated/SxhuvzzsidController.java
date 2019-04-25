package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SxhuvzzsidController {

    private final SxhuvzzsidService sxhuvzzsidService;

    public SxhuvzzsidController(SxhuvzzsidService sxhuvzzsidService) {
        this.sxhuvzzsidService = sxhuvzzsidService;
    }

    @RequestMapping("/sxhuvzzsid")
    public String index() {
        return sxhuvzzsidService.getGreeting();
    }

}
