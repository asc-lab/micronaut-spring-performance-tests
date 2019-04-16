package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class UmfmuhgeliController {

    private final UmfmuhgeliService umfmuhgeliService;

    public UmfmuhgeliController(UmfmuhgeliService umfmuhgeliService) {
        this.umfmuhgeliService = umfmuhgeliService;
    }

    @RequestMapping("/umfmuhgeli")
    public String index() {
        return umfmuhgeliService.getGreeting();
    }

}
