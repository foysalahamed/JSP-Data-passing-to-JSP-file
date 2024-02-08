import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

    @GetMapping("/data")
    public ModelAndView getData() {
        MyData myData = new MyData();
        myData.setMessage("Hello from Controller!");

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("myData", myData);
        modelAndView.setViewName("myPage"); // This corresponds to myPage.jsp

        return modelAndView;
    }
}


//import org.springframework.stereotype.Controller;
//        import org.springframework.ui.Model;
//        import org.springframework.web.bind.annotation.GetMapping;
//
//@Controller
//public class MyController {
//
//    @GetMapping("/data")
//    public String getData(Model model) {
//        MyData myData = new MyData();
//        myData.setMessage("Hello from Controller!");
//        model.addAttribute("myData", myData);
//        return "myPage"; // This corresponds to myPage.jsp
//    }
//}
