package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class JbxpfmbeqfController {

    private final JbxpfmbeqfService jbxpfmbeqfService;

    public JbxpfmbeqfController(JbxpfmbeqfService jbxpfmbeqfService) {
        this.jbxpfmbeqfService = jbxpfmbeqfService;
    }

    @RequestMapping("/jbxpfmbeqf")
    public String index() {
        return jbxpfmbeqfService.getGreeting();
    }

}
