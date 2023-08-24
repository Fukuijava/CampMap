package selfmade.webapp.campmap.controllse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import selfmade.webapp.campmap.dao.ListDao;
import selfmade.webapp.campmap.MyForm;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/campmap")
public class ListController {
    public record CampItem(String id, String number, String name, String address, String detail) {
    }

    private List<CampItem> campItems = new ArrayList<>();
    private ListDao dao;

    @Autowired
    ListController(ListDao dao) {
        this.dao = dao;
    }

    @GetMapping("/list")
    public String init(Model model) {
        model.addAttribute(new MyForm());
        List<CampItem> campItems = dao.findAll();
        model.addAttribute("campList", campItems);
        return "list";
    }

    @PostMapping("/campmap/update")
    public String submit(MyForm form) {
        String a = form.getSelectedValue();
        int b = Integer.parseInt(a);
        for (int i = 1; b >= i; i++) {
            if (i == b) {
                String number = String.valueOf(b);
                String name = form.selectKrn(b)+"キャンプ場";//メソッドを新しく作ってそれを呼び出す予定
                String address = form.selectKrn(b);
                String detail = "詳細へ";//メソッドを新しく作ってそれを呼び出す予定
                String id = UUID.randomUUID().toString().substring(0, 8);
                CampItem item = new CampItem(id, number, name, address, detail);
                dao.add(item);
            }
        }
        return "redirect:/campmap/list";
    }

    @GetMapping("/campmap/delete")
    String delete(@RequestParam("id") String id){
        this.dao.delete(id);
        return "redirect:/campmap/list";
    }

}