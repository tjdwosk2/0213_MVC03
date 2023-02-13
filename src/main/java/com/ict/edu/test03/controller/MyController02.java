package com.ict.edu.test03.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@Controller
public class MyController02 {
	
	// ���� ���ε��� ��� get ����� ����
	// cos ���̺귯���� pom.xml�� ����
	@RequestMapping(value = "f_up.do", method = RequestMethod.POST)
	public ModelAndView getFileUp(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView("test03/result");
		
		String path = request.getSession().getServletContext().getRealPath("/resources/images");
		
		try {
			MultipartRequest mr = new MultipartRequest(request, path, 500*1024*1024, "utf-8",new DefaultFileRenamePolicy());
			
			String name = mr.getParameter("name");
			String f_name = mr.getFilesystemName("f_name");
			String f_name2 = mr.getOriginalFileName("f_name");
			String file_type = mr.getContentType("f_name");
			
			File file = mr.getFile("f_name");
			
			long size = file.length()/1024;
			long last = file.lastModified();
			
			SimpleDateFormat day = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E");
			String lastday = day.format(file.lastModified());
			
			mv.addObject("name", name);
			mv.addObject("f_name", f_name);
			mv.addObject("f_name2", f_name2);
			mv.addObject("file_type", file_type);
			mv.addObject("size", size);
			mv.addObject("last", last);
			mv.addObject("lastday", lastday);
			
		} catch (Exception e) {
		}
		
		return mv;
	}
	
	@RequestMapping("down.do")
	public void getDown(HttpServletRequest request, HttpServletResponse response) {
		String f_name = request.getParameter("f_name");
		String path = request.getSession().getServletContext().getRealPath("/resources/images/"+f_name);
		
		try {
			// �ѱ� ó��dasd
			String real_path = URLEncoder.encode(path, "utf-8");
			
			// ������ ����
			response.setContentType("application/x-msdownload");
			response.setHeader("Content-Disposition", "attachment; filename="+real_path);
			
			File file = new File(new String(path.getBytes()));
			
			int b;
			FileInputStream fis = null;
			BufferedInputStream bis = null;
			BufferedOutputStream bos = null;
			
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(response.getOutputStream());
			
			while((b=bis.read()) != -1){
				bos.write(b);
				bos.flush();
			}
		} catch (Exception e) {
		}
	}
}
