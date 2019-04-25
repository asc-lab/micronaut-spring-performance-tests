package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class KhgxkiqjzkController {

    private final KhgxkiqjzkService khgxkiqjzkService;

    public KhgxkiqjzkController(KhgxkiqjzkService khgxkiqjzkService) {
        this.khgxkiqjzkService = khgxkiqjzkService;
    }

    @RequestMapping("/khgxkiqjzk")
    public String index() {
        return khgxkiqjzkService.getGreeting();
    }

}
