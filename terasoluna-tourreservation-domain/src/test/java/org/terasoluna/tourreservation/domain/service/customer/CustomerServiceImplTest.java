package org.terasoluna.tourreservation.domain.service.customer;

import static org.junit.Assert.*;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import org.terasoluna.gfw.common.exception.BusinessException;
import org.terasoluna.tourreservation.domain.model.Customer;
import static org.hamcrest.CoreMatchers.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:test-context.xml")
@Transactional
public class CustomerServiceImplTest {

	@Inject
	CustomerService customerService;
	
	@Test
	public void findOneTest01() {
		
		Customer customer = customerService.findOne("00000001");
		
		String actual = customer.getCustomerName();
		String expected = "木村　太郎";
		assertThat(actual, is(expected));
		
	}
	
	@Test(expected = BusinessException.class)
	public void findOneTest02(){
		customerService.findOne("00000020");
	}
	
	@Test(expected = BusinessException.class)
	public void findOneTest03(){
		customerService.findOne("ABC");
	}

}
