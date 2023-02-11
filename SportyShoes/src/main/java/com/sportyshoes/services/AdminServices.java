package com.sportyshoes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.sportyshoes.dao.AdminRepository;
import com.sportyshoes.enities.Admin;

@Service
public class AdminServices {
	
	@Autowired
	private AdminRepository adminRepo;
	
	public Admin addAdmin(Admin a) {
		Admin result = this.adminRepo.save(a);
		return result;
	}

}
