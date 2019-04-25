package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MxqbjyssoaController {

    private final MxqbjyssoaService mxqbjyssoaService;

    public MxqbjyssoaController(MxqbjyssoaService mxqbjyssoaService) {
        this.mxqbjyssoaService = mxqbjyssoaService;
    }

    @RequestMapping("/mxqbjyssoa")
    public String index() {
        return mxqbjyssoaService.getGreeting();
    }

}
