package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ZyhfurdcpnController {

    private final ZyhfurdcpnService zyhfurdcpnService;

    public ZyhfurdcpnController(ZyhfurdcpnService zyhfurdcpnService) {
        this.zyhfurdcpnService = zyhfurdcpnService;
    }

    @RequestMapping("/zyhfurdcpn")
    public String index() {
        return zyhfurdcpnService.getGreeting();
    }

}
