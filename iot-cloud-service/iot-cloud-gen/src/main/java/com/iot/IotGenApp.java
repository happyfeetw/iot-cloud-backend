package com.iot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.iot.system.annotation.EnableRyFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.iot.*.mapper")
@EnableRyFeignClients
public class IotGenApp
{
    public static void main(String[] args)
    {
        SpringApplication.run(IotGenApp.class, args);
    }
}
