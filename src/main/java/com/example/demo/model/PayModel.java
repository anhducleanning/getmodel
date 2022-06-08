package com.example.demo.model;

public class PayModel {
    private int id;
    private String name;
    private String delete_at;
    private String code_status;


    public PayModel(int id, String name, String delete_at, String code_status) {
        this.id = id;
        this.name = name;
        this.delete_at = delete_at;
        this.code_status = code_status;
    }

    public PayModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDelete_at() {
        return delete_at;
    }

    public void setDelete_at(String delete_at) {
        this.delete_at = delete_at;
    }

    public String getCode_status() {
        return code_status;
    }

    public void setCode_status(String code_status) {
        this.code_status = code_status;
    }
}
