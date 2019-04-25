package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class TorlhjvpidController {

    private final TorlhjvpidService torlhjvpidService;

    public TorlhjvpidController(TorlhjvpidService torlhjvpidService) {
        this.torlhjvpidService = torlhjvpidService;
    }

    @RequestMapping("/torlhjvpid")
    public String index() {
        return torlhjvpidService.getGreeting();
    }

}
