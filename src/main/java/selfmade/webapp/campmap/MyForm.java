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
        radioButtons.put(4, "宮城県");
        radioButtons.put(5, "秋田県");
        radioButtons.put(6, "山形県");
        radioButtons.put(7, "福島県");
        radioButtons.put(8, "茨城県");
        radioButtons.put(9, "栃木県");
        radioButtons.put(10, "群馬県");
        radioButtons.put(11, "埼玉県");
        radioButtons.put(12, "千葉県");
        radioButtons.put(13, "東京都");
        radioButtons.put(14, "神奈川県");
        radioButtons.put(15, "新潟県");
        radioButtons.put(16, "富山県");
        radioButtons.put(17, "石川県");
        radioButtons.put(18, "福井県");
        radioButtons.put(19, "山梨県");
        radioButtons.put(20, "長野県");
        radioButtons.put(21, "岐阜県");
        radioButtons.put(22, "静岡県");
        radioButtons.put(23, "愛知県");
        radioButtons.put(24, "三重県");
        radioButtons.put(25, "滋賀県");
        radioButtons.put(26, "京都府");
        radioButtons.put(27, "大阪府");
        radioButtons.put(28, "兵庫県");
        radioButtons.put(29, "奈良県");
        radioButtons.put(30, "和歌山県");
        radioButtons.put(31, "鳥取県");
        radioButtons.put(32, "島根県");
        radioButtons.put(33, "岡山県");
        radioButtons.put(34, "広島県");
        radioButtons.put(35, "山口県");
        radioButtons.put(36, "徳島県");
        radioButtons.put(37, "香川県");
        radioButtons.put(38, "愛媛県");
        radioButtons.put(39, "高知県");
        radioButtons.put(40, "福岡県");
        radioButtons.put(41, "佐賀県");
        radioButtons.put(42, "長崎県");
        radioButtons.put(43, "熊本県");
        radioButtons.put(44, "大分県");
        radioButtons.put(45, "宮崎県");
        radioButtons.put(46, "鹿児島県");
        radioButtons.put(47, "沖縄県");

        return radioButtons;
    }

    public String getSelectedValue() {
        return selectedValue;
    }

    public void setSelectedValue(String selectedValue) {
        this.selectedValue = selectedValue;
    }

    public String  selectKrn(int kenNumber) {//一時的な物
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
            case 4:
                kenName = "宮城県";
                break;
            case 5:
                kenName = "秋田県";
                break;
            case 6:
                kenName = "山形県";
                break;
            case 7:
                kenName = "福島県";
                break;
            case 8:
                kenName = "茨城県";
                break;
            case 9:
                kenName = "栃木県";
                break;
            case 10:
                kenName = "群馬県";
                break;
            case 11:
                kenName = "埼玉県";
                break;
            case 12:
                kenName = "千葉県";
                break;
            case 13:
                kenName = "東京都";
                break;
            case 14:
                kenName = "神奈川県";
                break;
            case 15:
                kenName = "新潟県";
                break;
            case 16:
                kenName = "富山県";
                break;
            case 17:
                kenName = "石川県";
                break;
            case 18:
                kenName = "福井県";
                break;
            case 19:
                kenName = "山梨県";
                break;
            case 20:
                kenName = "長野県";
                break;
            case 21:
                kenName = "岐阜県";
                break;
            case 22:
                kenName = "静岡県";
                break;
            case 23:
                kenName = "愛知県";
                break;
            case 24:
                kenName = "三重県";
                break;
            case 25:
                kenName = "滋賀県";
                break;
            case 26:
                kenName = "京都府";
                break;
            case 27:
                kenName = "大阪府";
                break;
            case 28:
                kenName = "兵庫県";
                break;
            case 29:
                kenName = "奈良県";
                break;
            case 30:
                kenName = "和歌山県";
                break;
            case 31:
                kenName = "鳥取県";
                break;
            case 32:
                kenName = "島根県";
                break;
            case 33:
                kenName = "岡山県";
                break;
            case 34:
                kenName = "広島県";
                break;
            case 35:
                kenName = "山口県";
                break;
            case 36:
                kenName = "徳島県";
                break;
            case 37:
                kenName = "香川県";
                break;
            case 38:
                kenName = "愛媛県";
                break;
            case 39:
                kenName = "高知県";
                break;
            case 40:
                kenName = "福岡県";
                break;
            case 41:
                kenName = "佐賀県";
                break;
            case 42:
                kenName = "長崎県";
                break;
            case 43:
                kenName = "熊本県";
                break;
            case 44:
                kenName = "大分県";
                break;
            case 45:
                kenName = "宮崎県";
                break;
            case 46:
                kenName = "鹿児島県";
                break;
            case 47:
                kenName = "沖縄県";
                break;
        }
        return kenName;
    }
}