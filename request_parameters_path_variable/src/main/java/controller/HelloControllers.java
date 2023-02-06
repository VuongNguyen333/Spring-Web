package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloControllers {
   @RequestMapping(value = "requestParam")
   public void testRequestParam(@RequestParam String user){
      System.out.println("User " + user);
   }
}
