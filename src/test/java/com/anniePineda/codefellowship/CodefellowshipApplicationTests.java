package com.anniePineda.codefellowship;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@AutoConfigureMockMvc
class CodefellowshipApplicationTests {

	@Test
	void contextLoads() {
	}


	//toStingifys
	@Test
	public void shouldHaveAGoodHomePage() throws Exception{
		this.mockMvc.perform(get())
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect()
	}


}
