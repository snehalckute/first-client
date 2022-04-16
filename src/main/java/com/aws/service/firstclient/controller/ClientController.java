/**
 * 
 */
package com.aws.service.firstclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aws.service.firstclient.dto.ResponseBean;
import com.aws.service.firstclient.services.ClientService;

/**
 * @author Snehooooo
 *
 */
@RestController
public class ClientController {
	
	@Autowired
	ClientService clientService;
	
	@GetMapping("/test/client")
	public ResponseBean testClient() {
		return clientService.testClient();
	}

}
