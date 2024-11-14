package com.example.cicd;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(SingleControllerApi.class)
public class SingleControllerApiTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetHorarios() throws Exception {
        mockMvc.perform(get("/horarios"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.horarioBrasilia").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$.horarioCalifornia").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$.horarioNovaIorque").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$.horarioChina").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$.horarioIndia").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$.horarioLondres").exists());
    }
}
