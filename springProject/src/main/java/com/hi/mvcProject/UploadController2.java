package com.hi.mvcProject;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadController2 {

	@RequestMapping("uploadForm")
	public void uploadForm(HttpServletRequest request,  MultipartFile file, Model model) throws Exception {
		//System.out.println("test");
		//String uploadPath = "/Users/administrator/Documents/java_workspace/spring1415/src/main/webapp/resources/upload";
		//String uploadPath = context.getRealPath("/") + "resources/upload";  
		//String uploadPath = "/Users/administrator/Documents/java_workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/conf/Catalina/localhost/resources/upload";  
		//String uploadPath = "/Users/administrator/Documents/java_workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/work/Catalina/localhost/mvc13/org/apache/jsp/resources/upload";
		String s1 = request.getContextPath();
		System.out.println(s1);
		String uploadPath = request.getSession().getServletContext().getRealPath( "resources/upload");
		System.out.println("업로드 경로는 " + uploadPath); 
		String savedName = file.getOriginalFilename();
		System.out.println(uploadPath + "/" + savedName);
		File target = new File(uploadPath + "/" + savedName);
		if (!target.isDirectory()) {
			target.mkdir();
		}
		//FileCopyUtils.copy(file.getBytes(), target);
		file.transferTo(target);
		
		String name = request.getParameter("name");
		
		model.addAttribute("savedName", savedName);
		model.addAttribute("name", name);
	
}
}
