package com.cvbank.controller;

import com.cvbank.config.WebMvcConfig;
import com.cvbank.repository.LanguagesRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@WebMvcTest(value = LanguagesController.class, secure = false)
public class LanguagesControllerTest {

    @Autowired
    private MockMvc mockMvc;


    @MockBean
    private LanguagesRepository languagesRepository;

    @Test
    public void getAllLanguages() throws Exception {


        MvcResult mvcResult = mockMvc.perform(get("/api/languages").contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andDo(print())
                .andExpect(jsonPath("$.data").isArray())
//                .andExpect(jsonPath("$.data[0].nameLang").isString())
//                .andExpect(jsonPath("$.data[0].id").isNumber())
                .andReturn();


//        Assert.assertEquals("application/json;charset=UTF-8",
//                mvcResult.getResponse().getContentType());
    }
}

