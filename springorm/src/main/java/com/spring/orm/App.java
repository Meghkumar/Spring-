package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.orm.dao.StudentDao;
import com.spring.orm.entites.Student;

public class App {
	public static void main(String[] args) {

		System.out.println("Process Started");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/orm/config.xml");
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

//        Student student = new Student(103,"Rohan","System_Engineer");
//        int result = studentDao.insert(student);
//        System.out.println("Data inserted: "+result);

		boolean go = true;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (go) {

			System.out.println("Press 1 for add new students");
			System.out.println("Press 2 for display all students");
			System.out.println("Press 3 to get the details of single student");
			System.out.println("Press 4 for delete students");
			System.out.println("Press 5 to update students");
			System.out.println("Press 6 for exit");

			try {

				int input = Integer.parseInt(br.readLine());

				switch (input) {
				case 1:

					// taking input from user
					System.out.println("Please enter the id: ");
					int uId = Integer.parseInt(br.readLine());

					System.out.println("Enter the username");
					String uName = br.readLine();

					System.out.println("Enter the post");
					String uPost = br.readLine();

					// Creating student object
					Student s = new Student();
					s.setStudentid(uId);
					s.setStudentname(uName);
					s.setStudentPost(uPost);

					/*
					 * saving Student object to database by calling studentDao as insert method is
					 * present in that class
					 */
					int r = studentDao.insert(s);
					System.out.println(r + " Student Added");

					System.out.println("----------------------------------------");

					break;

				case 2:

					List<Student> allstudents = studentDao.getAllStudent();
					for (Student st : allstudents) {
						System.out.println("id: " + st.getStudentid());
						System.out.println("Name: " + st.getStudentname());
						System.out.println("Post: " + st.getStudentPost());
					}
					break;

				case 3:
					System.out.println("Please enter the id: ");
					int userId = Integer.parseInt(br.readLine());
					Student student1 = studentDao.getStudent(userId);
					System.out.println("id: " + student1.getStudentid());
					System.out.println("Name: " + student1.getStudentname());
					System.out.println("Post: " + student1.getStudentPost());

					break;

				case 4:
					System.out.println("Please enter the id: ");
					int Id = Integer.parseInt(br.readLine());
					studentDao.deleteStudent(Id);
					System.out.println("Student Deleted.....");
					break;

				case 5:
					System.out.println("Please enter the id that you need to update: ");
					int user1 = Integer.parseInt(br.readLine());
					
					System.out.println("Enter Student Name: ");
					String userName = br.readLine();
					
					System.out.println("Enter Student Post: ");
					String userPost = br.readLine();
					
					Student s1 = new Student();
					s1.setStudentPost(userPost);
					s1.setStudentname(userName);
					s1.setStudentid(user1);
					
					studentDao.updateStudent(s1);
					System.out.println("Student updated succesfully...");
					
//					System.out.println("Enter user id which you want to update: ");
//					int user1=Integer.parseInt(br.readLine());
//					
//					System.out.println("Enter new student post: ");
//					String c=br.readLine();
//					System.out.println("Enter new student name: ");
//					String s1=br.readLine();
//					
//					Student st1=new Student();
//					
//					st1.setStudentPost(c);
//					st1.setStudentname(s1);
//					st1.setStudentid(user1);
//					studentDao.updateStudent(st1);
//					System.out.println("Student updated successfully...");
				
					break;

				default:

					go = false;
					break;
				}

			} catch (Exception e) {

				System.out.println("Invalid input please try again");
				System.out.println(e.getMessage());
			}

			System.out.println("Thank you for using my application");
		}

	}
}
