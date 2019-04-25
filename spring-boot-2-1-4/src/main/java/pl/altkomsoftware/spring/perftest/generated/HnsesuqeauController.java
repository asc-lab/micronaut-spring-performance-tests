package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HnsesuqeauController {

    private final HnsesuqeauService hnsesuqeauService;

    public HnsesuqeauController(HnsesuqeauService hnsesuqeauService) {
        this.hnsesuqeauService = hnsesuqeauService;
    }

    @RequestMapping("/hnsesuqeau")
    public String index() {
        return hnsesuqeauService.getGreeting();
    }

}
