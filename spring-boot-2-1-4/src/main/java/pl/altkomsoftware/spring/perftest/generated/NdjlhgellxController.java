package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class NdjlhgellxController {

    private final NdjlhgellxService ndjlhgellxService;

    public NdjlhgellxController(NdjlhgellxService ndjlhgellxService) {
        this.ndjlhgellxService = ndjlhgellxService;
    }

    @RequestMapping("/ndjlhgellx")
    public String index() {
        return ndjlhgellxService.getGreeting();
    }

}
