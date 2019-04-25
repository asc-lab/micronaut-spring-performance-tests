package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class QzapltyodiController {

    private final QzapltyodiService qzapltyodiService;

    public QzapltyodiController(QzapltyodiService qzapltyodiService) {
        this.qzapltyodiService = qzapltyodiService;
    }

    @RequestMapping("/qzapltyodi")
    public String index() {
        return qzapltyodiService.getGreeting();
    }

}
