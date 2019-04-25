package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ZispwwlrdxController {

    private final ZispwwlrdxService zispwwlrdxService;

    public ZispwwlrdxController(ZispwwlrdxService zispwwlrdxService) {
        this.zispwwlrdxService = zispwwlrdxService;
    }

    @RequestMapping("/zispwwlrdx")
    public String index() {
        return zispwwlrdxService.getGreeting();
    }

}
