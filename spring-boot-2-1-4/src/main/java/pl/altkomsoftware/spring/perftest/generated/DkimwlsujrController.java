package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DkimwlsujrController {

    private final DkimwlsujrService dkimwlsujrService;

    public DkimwlsujrController(DkimwlsujrService dkimwlsujrService) {
        this.dkimwlsujrService = dkimwlsujrService;
    }

    @RequestMapping("/dkimwlsujr")
    public String index() {
        return dkimwlsujrService.getGreeting();
    }

}
