package com.example.bookAPI.listener;

import java.util.UUID;

import org.springframework.data.mongodb.core.mapping.event.BeforeConvertCallback;
import org.springframework.stereotype.Component;

import com.example.bookAPI.model.CustomId;

@Component
public class CustomIdListener implements BeforeConvertCallback<CustomId> {
    @Override
public CustomId onBeforeConvert (CustomId model ,String collection){
    if(model.getId()==null || model.getId().isEmpty()){
        model.setId(UUID.randomUUID().toString());
    }return model;
}
}
