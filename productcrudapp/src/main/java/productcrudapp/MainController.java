package productcrudapp;

import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import productcrudapp.dao.ProductDao;
import productcrudapp.model.Product;

@Controller
public class MainController {
	
	@Autowired
	private ProductDao productDao;

	
	//handler for home page
	@RequestMapping("/")
	public String home(Model m) {
		
		List<Product> products = productDao.getProducts();
		
		m.addAttribute("product", products);
		return "index";
	}

	
	//Handler to add product form
	@RequestMapping("/add-product")
	public String addProduct(Model m) {

		m.addAttribute("title", "Add Product");
		return "add_product_form";
	}	

	
	// To handle the product form
	@RequestMapping(value = "/handle-product",method = RequestMethod.POST)
	public RedirectView handleProduct(@ModelAttribute Product product,HttpServletRequest request ) {
		
		System.out.println(product);
		RedirectView redirectView = new RedirectView();
		productDao.createProduct(product);
		redirectView.setUrl(request.getContextPath()+"/");
		return redirectView;
	}
	
	//handler for delete
	
	@RequestMapping("/delete/{productId}")
	public RedirectView deleteProduct(@PathVariable("productId")int productId,HttpServletRequest request) {
		
		this.productDao.deleteProducts(productId);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/");
		return redirectView;
	}

	
	@RequestMapping("/update/{productId}")
	public String updateForm(@PathVariable("productId")int id,Model m) {
		
		Product product = this.productDao.getProduct(id);
		m.addAttribute("product", product);
		return "update_form";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
