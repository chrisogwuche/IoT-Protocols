package org.example.iot_protocols.controller;

import lombok.RequiredArgsConstructor;
import org.example.iot_protocols.service.MqttPublisher;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
@RequiredArgsConstructor
public class DataController {

    private final MqttPublisher mqttPublisher;

    @PostMapping("/publish")
    public String publishData(@RequestBody String data) {
        mqttPublisher.publish("iot-data", data);
        return "Data published to MQTT broker!";
    }
}

