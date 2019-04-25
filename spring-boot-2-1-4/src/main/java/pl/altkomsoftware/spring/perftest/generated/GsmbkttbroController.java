package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class GsmbkttbroController {

    private final GsmbkttbroService gsmbkttbroService;

    public GsmbkttbroController(GsmbkttbroService gsmbkttbroService) {
        this.gsmbkttbroService = gsmbkttbroService;
    }

    @RequestMapping("/gsmbkttbro")
    public String index() {
        return gsmbkttbroService.getGreeting();
    }

}
