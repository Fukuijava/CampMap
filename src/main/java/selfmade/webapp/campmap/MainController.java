package selfmade.webapp.campmap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller
//@RequestMapping("/campmap")
public class MainController {
    record CampItem(String id, int number, String name, String ken, String city, String detail){}
    private List<CampItem> campItems = new ArrayList<>();

    @GetMapping("/list")
    public String init(Model model) {
        model.addAttribute(new MyForm());
        model.addAttribute("campList", campItems);
        return "main";
    }

    @PostMapping("/add")
    public String submit(MyForm form) {
        String  a = form.getSelectedValue();
        int b =  Integer.parseInt(a);
        for(int i = 1 ; b>=i ; i++){
            if(i==b){
                int number = b;
                String name =selectKrn(b)+"キャンプ場";//メソッドを新しく作ってそれを呼び出す予定
                String ken =selectKrn(b);
                String city ="〇〇市";//メソッドを新しく作ってそれを呼び出す予定
                String detail ="詳細へ";//メソッドを新しく作ってそれを呼び出す予定
                String id = UUID.randomUUID().toString().substring(0,8);
                CampItem item = new CampItem(id, number, name, ken, city, detail);
                campItems.add(item);
            }
        }
        return "redirect:/list";
    }
    private String selectKrn(int kenNumber){
        String kenName="";
        switch (kenNumber){
            case 1:
                kenName="北海道";
                break;
            case 2:
                kenName="青森県";
                break;
            case 3:
                kenName="岩手県";
                break;
        }
        return kenName;
    }
}