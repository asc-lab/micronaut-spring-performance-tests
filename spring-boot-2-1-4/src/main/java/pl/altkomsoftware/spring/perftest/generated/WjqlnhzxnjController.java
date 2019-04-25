package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class WjqlnhzxnjController {

    private final WjqlnhzxnjService wjqlnhzxnjService;

    public WjqlnhzxnjController(WjqlnhzxnjService wjqlnhzxnjService) {
        this.wjqlnhzxnjService = wjqlnhzxnjService;
    }

    @RequestMapping("/wjqlnhzxnj")
    public String index() {
        return wjqlnhzxnjService.getGreeting();
    }

}
