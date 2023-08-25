package selfmade.webapp.campmap.dao;

import selfmade.webapp.campmap.controllse.ListController.CampItem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Service;

import java.util.*;
import java.lang.*;

//import static org.springframework.http.HttpHeaders.FROM;

@Service
public class ListDao {
    private final static String TABLE_NAME = "tasklist";
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    ListDao(JdbcTemplate jdbcTemplate) {//フィールド地の初期化
        this.jdbcTemplate = jdbcTemplate;
    }

    public void add(CampItem campItem) {//タスクリストテーブルに登録するメソッド
        SqlParameterSource param = new BeanPropertySqlParameterSource(campItem);
        SimpleJdbcInsert insert = new SimpleJdbcInsert(jdbcTemplate).withTableName("camplist");
        insert.execute(param);
    }

    public List<CampItem> findAll() {//現在登録されているすべての情報を取得してListオブジェクトに格納して返す
        String query = "SELECT * FROM camplist";
        List<Map<String, Object>> result = jdbcTemplate.queryForList(query);
        List<CampItem> campItems = result.stream()
                .map((Map<String, Object> row) -> new CampItem(
                        (String) row.get("id"),
                        (String) row.get("number"),
                        (String) row.get("name"),
                        (String) row.get("address"),
                        (String) row.get("detail")))
                .toList();
        return campItems;
    }

    public int delete(String id) {
        int number = jdbcTemplate.update("DELETE FROM camplist WHERE id = ?", id);
        return number;

    }

    public int update(CampItem campItem) {
        int num = jdbcTemplate.update("DELETE FROM camplist");
//        number1 = jdbcTemplate.update(
//                "UPDATE camplist SET number = ?, name = ?, address = ?, detail = ? WHERE id = ?",
//                campItem.number(),
//                campItem.name(),
//                campItem.address(),
//                campItem.detail(),
//                campItem.id());
//        return number1;
        SqlParameterSource param = new BeanPropertySqlParameterSource(campItem);
        SimpleJdbcInsert insert = new SimpleJdbcInsert(jdbcTemplate).withTableName("camplist");
        insert.execute(param);
        return num;
    }


//        String sql = "UPDATE tasklist  WHERE number = ?";
//        List<Map<String, Object>> result = jdbcTemplate.queryForList(sql);
//        List<CampItem> campItems = result.stream()
//                .map((Map<String, Object> row) -> new CampItem(
//                        (String) row.get("id"),
//                        (String) row.get("number"),
//                        (String) row.get("name"),
//                        (String) row.get("address"),
//                        (String) row.get("detail")))
//                .toList();
//        return campItems;
//    }

//        int number = jdbcTemplate.update("DELETE FROM camplist");
//        String sql = "UPDATE tasklist  WHERE number = ?";
//        List<Map<String, Object>> result = jdbcTemplate.queryForList(sql);
//        List<CampItem> campItems = result.stream()
//                .map((Map<String, Object> row) -> new CampItem(
//                        (String) row.get("id"),
//                        (String) row.get("number"),
//                        (String) row.get("name"),
//                        (String) row.get("address"),
//                        (String) row.get("detail")))
//                .toList();
//        return campItems;
//    }
}
