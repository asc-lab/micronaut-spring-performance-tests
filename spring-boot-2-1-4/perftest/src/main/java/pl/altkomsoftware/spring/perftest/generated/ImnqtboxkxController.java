package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ImnqtboxkxController {

    private final ImnqtboxkxService imnqtboxkxService;

    public ImnqtboxkxController(ImnqtboxkxService imnqtboxkxService) {
        this.imnqtboxkxService = imnqtboxkxService;
    }

    @RequestMapping("/imnqtboxkx")
    public String index() {
        return imnqtboxkxService.getGreeting();
    }

}
