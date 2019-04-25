package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ZhatseqqgwController {

    private final ZhatseqqgwService zhatseqqgwService;

    public ZhatseqqgwController(ZhatseqqgwService zhatseqqgwService) {
        this.zhatseqqgwService = zhatseqqgwService;
    }

    @RequestMapping("/zhatseqqgw")
    public String index() {
        return zhatseqqgwService.getGreeting();
    }

}
