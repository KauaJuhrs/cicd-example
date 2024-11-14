package com.example.cicd;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.ZoneId;

@RestController
@RequestMapping("/horarios")
public class SingleControllerApi {
    @GetMapping()
    public ResponseEntity<SingleResponseDTO> getHorarios(){
        SingleResponseDTO response = new SingleResponseDTO();
        response.setHorarioBrasilia(LocalDateTime.now(ZoneId.of("America/Sao_Paulo")));
        response.setHorarioCalifornia(LocalDateTime.now(ZoneId.of("America/Los_Angeles")));
        response.setHorarioNovaIorque(LocalDateTime.now(ZoneId.of("America/New_York")));
        response.setHorarioChina(LocalDateTime.now(ZoneId.of("Asia/Shanghai")));
        response.setHorarioIndia(LocalDateTime.now(ZoneId.of("Asia/Kolkata")));
        response.setHorarioLondres(LocalDateTime.now(ZoneId.of("Europe/London")));

        return ResponseEntity.ok(response);
    }
}
