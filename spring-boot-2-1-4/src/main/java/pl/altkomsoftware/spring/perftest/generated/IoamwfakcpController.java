package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class IoamwfakcpController {

    private final IoamwfakcpService ioamwfakcpService;

    public IoamwfakcpController(IoamwfakcpService ioamwfakcpService) {
        this.ioamwfakcpService = ioamwfakcpService;
    }

    @RequestMapping("/ioamwfakcp")
    public String index() {
        return ioamwfakcpService.getGreeting();
    }

}
