//package com.example.demo.service;
//
//import com.example.demo.model.PayModel;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.RowMapper;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class PaySerivce {
//    private JdbcTemplate jdbcTemplate;
//
//    RowMapper<PayModel> rowMapper = (rs, rowNum) -> {
//        PayModel payModel = new PayModel();
//        payModel.setId(rs.getInt("id"));
//        payModel.setName(rs.getString("name"));
//        payModel.setDelete_at(rs.getString("deteted_at"));
//        payModel.setCode_status(rs.getString("code_status"));
//        return payModel;
//    };
//
//    public PaySerivce(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }
//
//    public List<PayModel> findAll() {
//        String sql = "SELECT id, name, deteted_at, code_status FROM student WHERE  code_status = 1";
//        return jdbcTemplate.query(sql,rowMapper);
//    }
//
//    public PayModel softDelete(PayModel payModel, int id){
//        String sql = "UPDATE student SET code_status = 0 WHERE id = ?";
//        int update = jdbcTemplate.update(sql,id);
//        if (update==1){
//            System.out.println("Soft Delete Successful");
//        }
//        return payModel;
//    }
//}
