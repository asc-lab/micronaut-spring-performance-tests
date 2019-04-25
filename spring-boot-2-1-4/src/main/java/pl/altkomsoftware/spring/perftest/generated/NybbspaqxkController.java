package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class NybbspaqxkController {

    private final NybbspaqxkService nybbspaqxkService;

    public NybbspaqxkController(NybbspaqxkService nybbspaqxkService) {
        this.nybbspaqxkService = nybbspaqxkService;
    }

    @RequestMapping("/nybbspaqxk")
    public String index() {
        return nybbspaqxkService.getGreeting();
    }

}
