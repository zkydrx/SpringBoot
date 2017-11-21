package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IntelliJ IDEA.
 * User: Abbot
 * Date: 2017-11-21
 * Time: 11:17
 * Description:
 */
@Controller
@EnableAutoConfiguration
public class SampleController
{
    @RequestMapping("/hello")
    @ResponseBody
    String home()
    {
        return "Hello World! SpringBoot.";
    }


    @RequestMapping("/index")
    @ResponseBody
    String yes(Model model)
    {
        model.addAttribute("name","zkydrx");
        return "index";
    }

    public static void main(String[] args)
    {
        SpringApplication.run(SampleController.class,args);
    }
}
