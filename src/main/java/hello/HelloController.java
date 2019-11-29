package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private Profile profile;

    @RequestMapping("/")
    public String index() {
        return this.profile.getMessage();
    }
}
