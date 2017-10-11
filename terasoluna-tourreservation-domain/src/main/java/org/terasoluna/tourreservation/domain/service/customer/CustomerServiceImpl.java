package org.terasoluna.tourreservation.domain.service.customer;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.terasoluna.gfw.common.exception.BusinessException;
import org.terasoluna.gfw.common.message.ResultMessage;
import org.terasoluna.gfw.common.message.ResultMessages;
import org.terasoluna.tourreservation.domain.model.Customer;
import org.terasoluna.tourreservation.domain.repository.customer.CustomerRepository;

@Transactional
@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Inject
	CustomerRepository customerRepository;
	
	@Override
	public Customer findOne(String customerCode) {
		
		Customer customer = customerRepository.findOne(customerCode);

		if (customer == null){
			
			ResultMessages message = ResultMessages.error().add("e.tr.9999");
			throw new BusinessException(message);
		}else{
			return customer;
		}
	}

}
