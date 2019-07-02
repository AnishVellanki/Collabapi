package com.ani.Colllabapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ani.CollabapiBackend.daoImpl.BlogDaoImpl;
import com.ani.CollabapiBackend.model.Blog;




@RestController
public class BlogController {
	
	@Autowired
	BlogDaoImpl blogDaoImpl;
	
	@RequestMapping("/addBlog")
	 public List<Blog> getAllBlogs()
	    {
	 Blog blog1=new Blog();
     Blog blog2=new Blog();
     
     blog1.setBlogName("Cricket");
     blog1.setBlogOwner("Anish");
     blog1.setBlogTitle("AtoZ");
     blog2.setBlogName("FootBall");
     blog2.setBlogOwner("Raja");
     blog2.setBlogTitle("ZtoA");
    
     List<Blog> blogList=new ArrayList<Blog>();
     blogList.add(blog1);
     blogList.add(blog2);
     
     return blogList;

	    }
	
     @PostMapping("/addBlog")
     public void addBlog(@RequestBody Blog blog)
     {
    	 //BlogDaoImpl blogDaoImpl=new BlogDaoImpl();
    System.out.println(blog.getBlogName());
    System.out.println(blog.getBlogOwner());
    System.out.println(blog.getBlogTitle());
    
    blogDaoImpl.addBlog(blog);
    
     }
  
     @PostMapping("/getBlog")
     public 	ModelAndView m1()
 	{
 		
 		List<Blog> list=null;
 		list=blogDaoImpl.getAllBlogs();
 		for(Blog b:list)
 		{
 			System.out.println(b.getBlogName());
			System.out.println(b.getBlogOwner());
			System.out.println(b.getBlogTitle());
		}
 		
 		
 		return null;
 	}
   
}