package com.josevabo.consulta.service;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ModelMapper extends org.modelmapper.ModelMapper {
    public ModelMapper() {
        super();
    }

    public <T,R> List<R> mapList(List<T> list, Class<R> returnType){
        return list.stream().map(item -> map(item, returnType)).collect(Collectors.toList());
    }
}
