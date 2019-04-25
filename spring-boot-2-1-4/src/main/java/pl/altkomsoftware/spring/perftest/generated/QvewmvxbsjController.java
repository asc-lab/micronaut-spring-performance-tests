package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class QvewmvxbsjController {

    private final QvewmvxbsjService qvewmvxbsjService;

    public QvewmvxbsjController(QvewmvxbsjService qvewmvxbsjService) {
        this.qvewmvxbsjService = qvewmvxbsjService;
    }

    @RequestMapping("/qvewmvxbsj")
    public String index() {
        return qvewmvxbsjService.getGreeting();
    }

}
