package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class EojdpvdfsxController {

    private final EojdpvdfsxService eojdpvdfsxService;

    public EojdpvdfsxController(EojdpvdfsxService eojdpvdfsxService) {
        this.eojdpvdfsxService = eojdpvdfsxService;
    }

    @RequestMapping("/eojdpvdfsx")
    public String index() {
        return eojdpvdfsxService.getGreeting();
    }

}
