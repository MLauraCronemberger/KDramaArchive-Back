package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.dto.DoramaDTO.DoramaCreateDTO;
import com.example.demo.entity.dto.DoramaDTO.DoramaResponseDTO;
import com.example.demo.service.DoramaService;

@RestController
@RequestMapping(value="/dorama")
@CrossOrigin("*")
public class DoramaController {

	@Autowired
	private DoramaService service;
	
	@PostMapping("/cadastrar")
	public DoramaResponseDTO createDorama(@RequestBody DoramaCreateDTO novoDorama) {
		System.out.println("aaa");
		System.out.println(novoDorama);
		return service.createDorama(novoDorama);
	}
}
