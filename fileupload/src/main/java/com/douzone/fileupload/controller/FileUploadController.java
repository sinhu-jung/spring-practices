package com.douzone.fileupload.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.douzone.fileupload.service.FileUploadService;

@Controller
public class FileUploadController {
	@Autowired
	private FileUploadService fileUploadService;
	
	@RequestMapping({"", "/form"})
	public String form() {
		return "/WEB-INF/views/form.jsp";
	}
	
	// 배열 말고 리스트도 처리됨
	//@RequestParam("file") MultipartFile[] files 배열로 받기 
	//@RequestParam("file1") MultipartFile files1,
	//@RequestParam("file2") MultipartFile files2
	@RequestMapping(value="/upload", method=RequestMethod.POST)
	public String upload(
			@RequestParam(value="email", required=true, defaultValue="") String email,
			@RequestParam("file1") MultipartFile file1,
			Model model) {
		System.out.println("email:" + email);
		String url = fileUploadService.restore(file1);
		model.addAttribute("url", url);
		return "/WEB-INF/views/result.jsp";
	}
}
