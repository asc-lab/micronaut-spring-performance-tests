package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ZakwycafksController {

    private final ZakwycafksService zakwycafksService;

    public ZakwycafksController(ZakwycafksService zakwycafksService) {
        this.zakwycafksService = zakwycafksService;
    }

    @RequestMapping("/zakwycafks")
    public String index() {
        return zakwycafksService.getGreeting();
    }

}
