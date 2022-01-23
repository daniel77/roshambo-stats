package com.ciklum.roshambostats;

import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@SpringBootTest
@AutoConfigureMockMvc
class RoshamboStatsApplicationTests {

  @Autowired
  private MockMvc mockMvc;

  @Test
  public void testIncrementP1() {
    MockHttpServletResponse response = performGet("/incrementp1");
    assertEquals(200, response.getStatus());
  }

  @Test
  public void testIncrementP2() {
    MockHttpServletResponse response = performGet("/incrementp2");
    assertEquals(200, response.getStatus());
  }

  @Test
  public void testIncrementDraw() {
    MockHttpServletResponse response = performGet("/incrementdraw");
    assertEquals(200, response.getStatus());
  }

  @Test
  public void testIncrementTotal() {
    MockHttpServletResponse response = performGet("/incrementtotal");
    assertEquals(200, response.getStatus());
  }

  @Test
  public void testStats() {
    MockHttpServletResponse response = performGet("/stats");
    assertEquals(200, response.getStatus());
  }

  @SneakyThrows
  private MockHttpServletResponse performGet(String entryPoint) {
    return mockMvc.perform(get(entryPoint)
        .content("")).andReturn().getResponse();
  }
}
