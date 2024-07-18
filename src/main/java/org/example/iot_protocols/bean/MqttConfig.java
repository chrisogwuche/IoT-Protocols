//package org.example.iot_protocols.bean;
//
//import org.eclipse.paho.client.mqttv3.MqttClient;
//import org.eclipse.paho.client.mqttv3.MqttException;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class MqttConfig {
//
//    @Value("${mqtt.broker-url}")
//    private String brokerUrl;
//
//    @Bean
//    public MqttClient mqttClient(){
//
//        return new MqttClient(brokerUrl, MqttClient.generateClientId()).connect();
//
//}
