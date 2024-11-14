package com.example.cicd;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class SingleResponseDTO {
    public LocalDateTime horarioBrasilia;
    public LocalDateTime horarioCalifornia;
    public LocalDateTime horarioNovaIorque;
    public LocalDateTime horarioChina;
    public LocalDateTime horarioIndia;
    public LocalDateTime horarioLondres;
}
