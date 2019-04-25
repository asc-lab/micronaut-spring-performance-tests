package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class QzaqtrqoduController {

    private final QzaqtrqoduService qzaqtrqoduService;

    public QzaqtrqoduController(QzaqtrqoduService qzaqtrqoduService) {
        this.qzaqtrqoduService = qzaqtrqoduService;
    }

    @RequestMapping("/qzaqtrqodu")
    public String index() {
        return qzaqtrqoduService.getGreeting();
    }

}
