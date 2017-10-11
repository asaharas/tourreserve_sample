package org.terasoluna.tourreservation.app.referencecustomer;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.terasoluna.gfw.common.exception.BusinessException;
import org.terasoluna.tourreservation.domain.model.Customer;
import org.terasoluna.tourreservation.domain.service.customer.CustomerService;

@Controller
@RequestMapping("customers/{customerCode}")
public class ReferenceController {
	
	private static final Logger logger = LoggerFactory.getLogger(ReferenceController.class);
	
	@Inject
	CustomerService customerService;
	
	@RequestMapping(method = RequestMethod.GET)
    public String reference(@PathVariable("customerCode") String customerCode, Model model) {
        logger.info("reference view");
        
        try{
        	Customer customer = customerService.findOne(customerCode);
        	model.addAttribute(customer);
        }catch(BusinessException e){
        	model.addAttribute(e.getResultMessages());
        }
        
        return "referencecustomer/detail";
    }

}
