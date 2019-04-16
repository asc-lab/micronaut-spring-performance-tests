package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class FprczxggwfController {

    private final FprczxggwfService fprczxggwfService;

    public FprczxggwfController(FprczxggwfService fprczxggwfService) {
        this.fprczxggwfService = fprczxggwfService;
    }

    @RequestMapping("/fprczxggwf")
    public String index() {
        return fprczxggwfService.getGreeting();
    }

}
