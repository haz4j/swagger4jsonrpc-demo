package com.example.web;


import com.googlecode.jsonrpc4j.spring.AutoJsonRpcServiceImpl;
import org.springframework.stereotype.Service;

@Service
@AutoJsonRpcServiceImpl
public class Impl implements ApiInterface {

    @Override
    public Integer save(Integer value){
        return value;
    }
}