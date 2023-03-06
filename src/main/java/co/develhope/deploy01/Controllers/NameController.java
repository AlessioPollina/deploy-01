package co.develhope.deploy01.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/name")
public class NameController {

    @Autowired
    private Environment environment;

    @GetMapping("/")
    public String mainEndpoint(){
        String var = environment.getProperty("devName");
        return var;
    }
}
