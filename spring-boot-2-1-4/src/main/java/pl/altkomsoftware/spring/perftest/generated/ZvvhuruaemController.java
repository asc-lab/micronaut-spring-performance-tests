package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ZvvhuruaemController {

    private final ZvvhuruaemService zvvhuruaemService;

    public ZvvhuruaemController(ZvvhuruaemService zvvhuruaemService) {
        this.zvvhuruaemService = zvvhuruaemService;
    }

    @RequestMapping("/zvvhuruaem")
    public String index() {
        return zvvhuruaemService.getGreeting();
    }

}
