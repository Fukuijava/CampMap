package selfmade.webapp.campmap.controllse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import selfmade.webapp.campmap.dao.ListDao;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DetailController {
    public ListDao dao;
    @Autowired
    DetailController(ListDao dao) {
        this.dao = dao;
    }
    @GetMapping("/campmap/detail/{id}")
    public String init(@RequestParam("id") String id,
                        Model model) {
        List<ListController.CampItem> campItems = this.dao.detail(id);
        model.addAttribute("campList", campItems);
        return "detail";
    }
}
