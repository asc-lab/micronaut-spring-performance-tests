package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class IeckjhejqtController {

    private final IeckjhejqtService ieckjhejqtService;

    public IeckjhejqtController(IeckjhejqtService ieckjhejqtService) {
        this.ieckjhejqtService = ieckjhejqtService;
    }

    @RequestMapping("/ieckjhejqt")
    public String index() {
        return ieckjhejqtService.getGreeting();
    }

}
