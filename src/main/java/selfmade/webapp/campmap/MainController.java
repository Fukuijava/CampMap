package selfmade.webapp.campmap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;

import java.awt.datatransfer.DataFlavor;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/campmap")
public class MainController {
    record CampItem(String id, int number, String name, String ken, String city, String detail) {
    }
//    record KenItem(int value){}

    private List<CampItem> campItems = new ArrayList<>();
//    private List<KenItem> kenItems = new ArrayList<>();

    @GetMapping("/list")
    String listItems(Model model) {
        model.addAttribute("campList", campItems);
        return "main";
    }
//    @RequestParam()
//    String kenItems(Model model) {
//        model.addAttribute("kenList", kenItems);
//        return "/add";
//    }

    @GetMapping("/add")
        String addItem (){
        String id = UUID.randomUUID().toString().substring(0, 8);
        switch (1) {
            case 1:
                int number = 1;
                String name = "キャンプ場名";
                String ken = "北海道";
                String city  = "札幌市";
                String detail = "詳細へ";
                CampItem item = new CampItem(id, number, name, ken, city, detail);
                campItems.add(item);
                break;
        }
        return "redirect:/list";
    }
}
//    @GetMapping("/add")
//    String addItem() {
//        String id = UUID.randomUUID().toString().substring(0, 8);
//        int number = 1;
//        String name = "aaa";
//        String ken = "北海道";
//        String city = "札幌市";
//        String detail = "詳細へ";
//
//        CampItem item = new CampItem(id,number, name, ken, city, detail);
//        campItems.add(item);
//
//        return "redirect:/list";
//    }
//}

