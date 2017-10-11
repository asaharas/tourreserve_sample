package org.terasoluna.tourreservation.domain.service.customer;

import org.terasoluna.tourreservation.domain.model.Customer;

public interface CustomerService {
	
	Customer findOne(String customerCode);

}
