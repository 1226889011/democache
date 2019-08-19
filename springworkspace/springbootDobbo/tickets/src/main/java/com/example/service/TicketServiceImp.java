package com.example.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Component
@Service//将服务发布出去
public class TicketServiceImp implements TicketService {
    @Override
    public String getticket() {
        return "《我爱你，中国》";
    }
}
