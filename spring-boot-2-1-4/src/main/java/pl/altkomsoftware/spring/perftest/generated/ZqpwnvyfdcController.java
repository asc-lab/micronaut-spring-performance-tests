package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ZqpwnvyfdcController {

    private final ZqpwnvyfdcService zqpwnvyfdcService;

    public ZqpwnvyfdcController(ZqpwnvyfdcService zqpwnvyfdcService) {
        this.zqpwnvyfdcService = zqpwnvyfdcService;
    }

    @RequestMapping("/zqpwnvyfdc")
    public String index() {
        return zqpwnvyfdcService.getGreeting();
    }

}
