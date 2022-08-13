package springmvcSearch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadController {

	@RequestMapping("/fileform")
	public String showUploadForm() {
		
		String str = null;
		System.out.println(str.charAt(0));

		return "fileform";

	}

	// In here we use [**COMMON_MULTIPART_FILE**] method for file uploadation

	@RequestMapping(path = "/uploadImage", method = RequestMethod.POST)
	public String fileUpload(@RequestParam("profile") CommonsMultipartFile file, HttpSession session, Model m) {

		System.out.println("File uplaoded");
		System.out.println(file.getSize());
		System.out.println(file.getContentType());
		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getStorageDescription());
		System.out.println(file.getFileItem());

		byte[] data = file.getBytes();
		// we have to save the file in server

		String path = session.getServletContext().getRealPath("/") + "WEB-INF" + File.separator + "resourses"
				+ File.separator + "images" + file.getOriginalFilename();
		System.out.println(path);
		try {
			FileOutputStream fos = new FileOutputStream(path);
			fos.write(data);
			fos.close();
			System.out.println("File uploaded");
			
			m.addAttribute("msg","File uploaded Successfully");
			m.addAttribute("filename",file.getOriginalFilename());
			

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} catch (IOException e) {

			m.addAttribute("msg","Uploading error");
			e.printStackTrace();
		}

		return "filesuccess";
	}

}
