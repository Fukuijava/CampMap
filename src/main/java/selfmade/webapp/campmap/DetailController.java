//package selfmade.webapp.campmap;

//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import java.util.ArrayList;
//import java.util.List;

//@Controller
//@RequestMapping("/campmap")
//public class DetailController {
//    record DetailItem(String id, String name, String address, String detail){}
//    private List<DetailItem> detailItems = new ArrayList<>();
//    @GetMapping("/detail/")
//    public String init(Model model) {
//        model.addAttribute("detailList", detailItems);
//        return "detail";
//    }
//}
