package com.example.Teacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.example.Teacher.TeacherInfo;
import com.example.Teacher.TeacherRepository;
import com.example.Teacher.StudentInfo;
import com.example.Teacher.StudentRepository;

@RestController    
@RequestMapping(path="/LoginPage") 
@CrossOrigin(origins={"http://localhost:3000"})
public class MainController 
{
	@Autowired 
	private TeacherRepository teacherRepository;
	@Autowired
    private StudentRepository studentRepository;
	
//	@RequestMapping(value= {"/addTeacher"}, method=RequestMethod.POST)
//	@ResponseStatus(HttpStatus.OK)
//	@ResponseBody
//	public ResponseEntity<?> addNewTeacher(@RequestBody StudentInfo student,UriComponentsBuilder uCB)
//	{
//		studentRepository.createStudent(student);
//		UriComponents uc=uCB.path("/{id}").buildAndExpand(student.getId());
//		return ResponseEntity.created(uc.toUri()).build();
//	}
	
	@GetMapping(path="/addTeacher") 
	public @ResponseBody String addNewTeacher (@RequestParam String firstName
			, @RequestParam String lastName ,@RequestParam String userName
			, @RequestParam String password) 
	{
		TeacherInfo n = new TeacherInfo();
		n.setfirstName(firstName);
		n.setlastName(lastName);
		n.setuserName(userName);
		n.setpassword(password);
		teacherRepository.save(n);
		return "Saved";
	}
//	@RequestMapping(value= {"/addNewStudent"}, method=RequestMethod.POST)
//	@ResponseStatus(HttpStatus.CREATED)
//	@ResponseBody
//	public ResponseEntity<?> addNewStudent(@RequestBody StudentInfo student,UriComponentsBuilder uCB)
//	{
//		studentRepository.createStudent(student);
//		UriComponents uc=uCB.path("/{id}").buildAndExpand(student.getId());
//		return ResponseEntity.created(uc.toUri()).build();
//	}
	@GetMapping(path="/addNewStudent") 
	public @ResponseBody String addNewStudent (@RequestParam String firstName
			, @RequestParam String lastName ,@RequestParam String Class
			, @RequestParam String Division
			, @RequestParam String AddressLine1
			, @RequestParam String AddressLine2
			, @RequestParam Integer pincode) 
	{
		StudentInfo s = new StudentInfo();
		s.setfirstName(firstName);
		s.setlastName(lastName);
		s.setClass1(Class);
		s.setDivision(Division);
		s.setAddressLine1(AddressLine1);
		s.setAddressLine2(AddressLine2);
		s.setpincode(pincode);
		studentRepository.save(s);
		return "Saved";
	}
	
	@RequestMapping(value="/ListOfStudents" ,method=RequestMethod.GET )
	public @ResponseBody Iterable<StudentInfo> getAllStudents() 
	{
		return studentRepository.findAll();
	}
	
	@RequestMapping(value="/deleteStudent/{id}",method=RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.OK)
	public void deleteStudent(@PathVariable("id") int id)
	{
		studentRepository.deleteById(id);
	}
//	@RequestMapping(value="/EditStudent", method=RequestMethod.PUT )
//	@ResponseStatus(HttpStatus.OK)
//	public void updateStudent(@RequestBody StudentInfo student)
//	{
//		studentRepository.update(student);
//	}
//	
//	public ResponseEntity<StudentInfo> findOneStudent(@PathVariable("id") int studentid)
//	{
//		StudentInfo student=studentRepository.findStudentById(studentid);
//		HttpStatus status=student!=null?HttpStatus.OK:HttpStatus.NOT_FOUND;
//		return new ResponseEntity<StudentInfo>(student,status);
//		
//	}
}
