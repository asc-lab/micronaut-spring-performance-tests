package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class YkmhejumsiController {

    private final YkmhejumsiService ykmhejumsiService;

    public YkmhejumsiController(YkmhejumsiService ykmhejumsiService) {
        this.ykmhejumsiService = ykmhejumsiService;
    }

    @RequestMapping("/ykmhejumsi")
    public String index() {
        return ykmhejumsiService.getGreeting();
    }

}
