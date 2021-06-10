package team.spring.project.playground2b;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PdsController {
    @GetMapping("/pds/list")
    public String list() {
        return "pds/list";
    }
}
