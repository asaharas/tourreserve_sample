package org.terasoluna.tourreservation.domain.repository.customer;

import org.terasoluna.tourreservation.domain.model.Customer;

public interface CustomerRepository {
	
	Customer findOne(String customerCode);

}
