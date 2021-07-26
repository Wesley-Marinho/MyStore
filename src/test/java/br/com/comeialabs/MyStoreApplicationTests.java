package br.com.comeialabs;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.comeialabs.domain.Salesperson;
import br.com.comeialabs.repository.SalespersonRepository;

@SpringBootTest
class MyStoreApplicationTests {

	@Autowired
	private SalespersonRepository salespersonRepository;
	
	@Test
	void contextLoads() {
		Salesperson salesperson = new Salesperson();
		salesperson.setName("Jorge");
		salespersonRepository.save(salesperson);
	}

}
