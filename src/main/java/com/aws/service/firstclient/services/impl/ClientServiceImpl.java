/**
 * 
 */
package com.aws.service.firstclient.services.impl;

import org.springframework.stereotype.Service;

import com.aws.service.firstclient.dto.ResponseBean;
import com.aws.service.firstclient.services.ClientService;

/**
 * @author Snehooooo
 *
 */
@Service
public class ClientServiceImpl implements ClientService {

	@Override
	public ResponseBean testClient() {
		ResponseBean responseBean= new ResponseBean();
		
		responseBean.setStatus("SUCCESS");
		responseBean.setMessage("Test Completed");
		
		return responseBean;
	}

}
