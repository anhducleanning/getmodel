//package com.example.demo.controller;
//
//
//import com.example.demo.model.PayModel;
//import com.example.demo.service.PaySerivce;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import javax.annotation.PostConstruct;
//import java.util.List;
//
//@RestController
//public class Controller {
//
//    @Autowired
//    PaySerivce paySerivce;
//
//    @GetMapping("/getlists")
//    public ResponseEntity<?> payModelList(){
//         List<PayModel> list = paySerivce.findAll();
//         return new ResponseEntity<>(list,HttpStatus.OK);
//    }
//
//
//    @DeleteMapping("/softdelete/{id}")
//    public ResponseEntity<?> softDelete(@RequestBody PayModel payModel,@PathVariable("id") int id){
//            PayModel softDeletePayMode = paySerivce.softDelete(payModel,id);
//            return new ResponseEntity<>(softDeletePayMode,HttpStatus.OK);
//    }
//
//
//}
