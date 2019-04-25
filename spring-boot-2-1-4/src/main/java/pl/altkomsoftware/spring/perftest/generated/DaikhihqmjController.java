package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DaikhihqmjController {

    private final DaikhihqmjService daikhihqmjService;

    public DaikhihqmjController(DaikhihqmjService daikhihqmjService) {
        this.daikhihqmjService = daikhihqmjService;
    }

    @RequestMapping("/daikhihqmj")
    public String index() {
        return daikhihqmjService.getGreeting();
    }

}
