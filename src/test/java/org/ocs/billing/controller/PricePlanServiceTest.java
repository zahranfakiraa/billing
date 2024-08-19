package org.ocs.billing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.MockMvcBuilder.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.ocs.billing.common.ApiResponse;
import org.ocs.billing.dto.pPrice.CreatePricePlanRequest;
import org.ocs.billing.repository.pPrice.PpricePlanRepository;
import org.ocs.billing.repository.sub.SubsPricePlanRepository;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class PricePlanServiceTest {

    private ObjectMapper objectMapper;

    private MockMvc mockMvc;

    @Autowired
    private PpricePlanRepository ppricePlanRepository;

    @Autowired
    private SubsPricePlanRepository subsPricePlanRepository;

    @BeforeEach
    void setUp() {
        ppricePlanRepository.deleteAll();
        subsPricePlanRepository.deleteAll();
    }

    @Test
    void testCreatePricePlan() throws Exception {

        CreatePricePlanRequest request = new CreatePricePlanRequest();
        request.setPricePlanName("test");
        request.setPricePlanName("");

        mockMvc.perform(
                post("/api/priceplan")
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(request)))
                .andExpectAll(status().isBadRequest()).andDo(result -> {
                    ApiResponse<String> response = objectMapper.readValue(result.getResponse().getContentAsString(),
                            new TypeReference<>() {
                            });
                    assertNotNull(response.getErrors());
                });
    }
}
