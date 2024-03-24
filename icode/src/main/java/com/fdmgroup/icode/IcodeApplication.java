package com.fdmgroup.icode;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fdmgroup.icode.image.upload.service.FilesStorageServiceImpl;

import jakarta.annotation.Resource;

@SpringBootApplication
public class IcodeApplication  implements CommandLineRunner{
	
	@Resource
	private FilesStorageServiceImpl storageService;
	
	public static void main(String[] args) {
		SpringApplication.run(IcodeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		storageService.init();
	}
	
	
	
}