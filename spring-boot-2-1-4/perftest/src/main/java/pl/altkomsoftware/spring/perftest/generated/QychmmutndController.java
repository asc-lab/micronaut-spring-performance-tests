package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class QychmmutndController {

    private final QychmmutndService qychmmutndService;

    public QychmmutndController(QychmmutndService qychmmutndService) {
        this.qychmmutndService = qychmmutndService;
    }

    @RequestMapping("/qychmmutnd")
    public String index() {
        return qychmmutndService.getGreeting();
    }

}
