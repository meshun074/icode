package com.fdmgroup.icode.eshopping;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/e-shopping")
public class EShoppingController {

	/*
	 * This class with declare both 
	 * a ProductService and an ApplicationContext
	 */

	
	public EShoppingController() {
		super();
		/*
		 * You will take both the service and the application 
		 * context through the constructor and set their attributes in this class
		 */
	}

	@GetMapping("/display-products")
	public String goDisplayProducts(Model model) {
		/*
		 * This method will call the service getAllProducts()
		 * and store the result on the model so it can be displayed
		 * on the html.
		 */
		return "e-shopping/display-products";
	}

	@GetMapping("/add-to-cart/{id}")
	public String addToCart(HttpSession session, @PathVariable long id) {
		/*
		 * In this method you will grab the ShoppingCart from the session
		 * 	If the cart is null then you will grab an instance from the 
		 * 		context with the getBean() method.
		 * You will use the service to grab the selected product by id
		 * and then add that to the shoppingCart
		 * Finally, you will set the 'cart' attribute on the session.
		 */
		return "forward:/display-products";

	}

	@GetMapping("/remove-from-cart/{id}")
	public String removeFromCart(HttpSession session, @PathVariable long id) {
		/*
		 * You will grab the cart from the session 
		 * then you will use the service to find the product by id
		 * finally you will remove that product from the shopping cart 
		 * 		and reset the attribute on the session.
		 */
		return "forward:/display-products";
	}

	// mapping to handle exception being thrown

}
