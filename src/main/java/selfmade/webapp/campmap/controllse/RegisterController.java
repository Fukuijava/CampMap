package selfmade.webapp.campmap.controllse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import selfmade.webapp.campmap.dao.ListDao;
import selfmade.webapp.campmap.MyForm;

import java.util.UUID;

@Controller
public class RegisterController {

    private ListDao dao;

    @Autowired
    RegisterController(ListDao dao) {
        this.dao = dao;
    }

    @GetMapping("/campmap/register")
    public String init(Model model) {
        model.addAttribute(new MyForm());
        return "register";
    }
    @PostMapping("/campmap/add")
    public String submit(MyForm form) {
        String a = form.getSelectedValue();
        int b = Integer.parseInt(a);
        for (int i = 1; b >= i; i++) {
            if (i == b) {
                String number = String.valueOf(b);
                String name = selectKrn(b) + "キャンプ場";//メソッドを新しく作ってそれを呼び出す予定
                String address = selectKrn(b);
                String detail = "詳細へ";//メソッドを新しく作ってそれを呼び出す予定
                String id = UUID.randomUUID().toString().substring(0, 8);
                ListController.CampItem item = new ListController.CampItem(id, number, name, address, detail);
                dao.add(item);
            }
        }
        return "redirect:/campmap/list";
    }

    private String selectKrn(int kenNumber) {//一時的な物
        String kenName = "";
        switch (kenNumber) {
            case 1:
                kenName = "北海道";
                break;
            case 2:
                kenName = "青森県";
                break;
            case 3:
                kenName = "岩手県";
                break;
        }
        return kenName;
    }


}
