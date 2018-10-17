//package com.example.Teacher;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.authority.AuthorityUtils;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import fi.haagahelia.course.domain.User;
//
//
//@Service
//public class TeacherDetailsServiceImp implements UserDetailsService 
//{
//	private final TeacherRepository trepository;
//	
//	@Autowired
//	public TeacherDetailServiceImpl(TeacherRepository teacherRepository) 
//	{
//		this.trepository = teacherRepository;
//	}
//	@Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException 
//    {   
//    	TeacherInfo curruser = trepository
//        UserDetails user = new org.springframework.security.core.userdetails.User(
//        		username, curruser.getPasswordHash()));
//        return user;
//    }   
//}
