package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CdktudpxpeController {

    private final CdktudpxpeService cdktudpxpeService;

    public CdktudpxpeController(CdktudpxpeService cdktudpxpeService) {
        this.cdktudpxpeService = cdktudpxpeService;
    }

    @RequestMapping("/cdktudpxpe")
    public String index() {
        return cdktudpxpeService.getGreeting();
    }

}
