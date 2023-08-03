package selfmade.webapp.campmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class MyForm {
    private String selectedValue;

    public Map<Integer, String> options() {
        Map<Integer, String> radioButtons = new LinkedHashMap<>();
        radioButtons.put(1, "北海道");
        radioButtons.put(2, "青森県");
        radioButtons.put(3, "岩手県");

        return radioButtons;
    }

    public String getSelectedValue() {
        return selectedValue;
    }

    public void setSelectedValue(String selectedValue) {
        this.selectedValue = selectedValue;
    }
}