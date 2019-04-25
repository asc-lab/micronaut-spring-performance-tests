package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ZstieconabController {

    private final ZstieconabService zstieconabService;

    public ZstieconabController(ZstieconabService zstieconabService) {
        this.zstieconabService = zstieconabService;
    }

    @RequestMapping("/zstieconab")
    public String index() {
        return zstieconabService.getGreeting();
    }

}
