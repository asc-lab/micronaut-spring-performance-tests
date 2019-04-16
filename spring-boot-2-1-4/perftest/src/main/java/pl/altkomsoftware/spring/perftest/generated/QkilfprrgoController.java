package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class QkilfprrgoController {

    private final QkilfprrgoService qkilfprrgoService;

    public QkilfprrgoController(QkilfprrgoService qkilfprrgoService) {
        this.qkilfprrgoService = qkilfprrgoService;
    }

    @RequestMapping("/qkilfprrgo")
    public String index() {
        return qkilfprrgoService.getGreeting();
    }

}
