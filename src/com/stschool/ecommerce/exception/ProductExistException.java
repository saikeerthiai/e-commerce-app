package com.stschool.ecommerce.exception;

public class ProductExistException extends RuntimeException{
    public ProductExistException(String msg){
        super(msg);
    }
}
