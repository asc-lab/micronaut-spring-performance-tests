package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class XcaznginhdController {

    private final XcaznginhdService xcaznginhdService;

    public XcaznginhdController(XcaznginhdService xcaznginhdService) {
        this.xcaznginhdService = xcaznginhdService;
    }

    @RequestMapping("/xcaznginhd")
    public String index() {
        return xcaznginhdService.getGreeting();
    }

}
