package br.com.pyetro.facade;

public class Apartment {
    private long code;
    private String address;
    public Apartment(Long code,String address){
        this.code = code;
        this.address = address;
    }

    public Long getCode(){
        return code;
    }

    public void setCode(Long code){
        this.code = code;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
}
