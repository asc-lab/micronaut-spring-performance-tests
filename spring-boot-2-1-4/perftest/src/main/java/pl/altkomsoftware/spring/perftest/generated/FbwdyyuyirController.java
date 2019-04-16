package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class FbwdyyuyirController {

    private final FbwdyyuyirService fbwdyyuyirService;

    public FbwdyyuyirController(FbwdyyuyirService fbwdyyuyirService) {
        this.fbwdyyuyirService = fbwdyyuyirService;
    }

    @RequestMapping("/fbwdyyuyir")
    public String index() {
        return fbwdyyuyirService.getGreeting();
    }

}
