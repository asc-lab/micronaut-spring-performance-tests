package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DtauynkpyzController {

    private final DtauynkpyzService dtauynkpyzService;

    public DtauynkpyzController(DtauynkpyzService dtauynkpyzService) {
        this.dtauynkpyzService = dtauynkpyzService;
    }

    @RequestMapping("/dtauynkpyz")
    public String index() {
        return dtauynkpyzService.getGreeting();
    }

}
