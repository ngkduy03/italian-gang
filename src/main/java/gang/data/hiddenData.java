package gang.data;

import gang.pizza.Pizza;
import gang.pizza.PizzaDAO;

public class hiddenData {
	public static void postItem() {
		String[] pizzaName = {
				"Veggie Supreme",
				"Double Topping Seafood Pesto Pizza",
				"Double Topping Ocean Delight Pizza",
				"Cheese Crust Half & Half Pizza",
				"1/2 Veggie Supreme",
				"Pizza Go Creamy Pesto Chicken",
				"Pizza Go Bacon",
				"Pizza Go Black Pepper Beef",
				"1/2 Seafood Pesto",
				"Seafood Black Pepper",
				"Cheese Crust Half & Half Pizza",
				"1/2 Supreme",
				"1/2 Supreme Meat Lover's",
				"1/2 Veggie Supreme (Garlic Parsley Butter Sauce)",
				"1/2 Chicken Deluxe",
				"1/2 Hawaiian Paradise",
				"1/2 Ocean Deligh",
				"1/2 Pepperoni",
				"Chicken Deluxe",
				"Korean Bbq Spicy Beef",
		};

		String[] pizzaDescription = {
				"Black olives, fresh cherry tomatoes, mushrooms, pineapples, sweet corns, onions and Mozzarella cheese",
				"Double topping of seafood (shrimp, squids) with sliced mushrooms, our signature Pesto sauce, perfectly melted Mozzarella cheese from New Zealand, topped with fresh basil.",
				"Double topping of seafood (squid, crabsticks) with pineapple & green capsicum, with Cheesy Mayonnaise sauce and perfectly melted Mozzarella cheese from New Zealand.",
				"Choose your 2 types of pizza toppings",
				"Black olives, fresh cherry tomatoes, mushrooms, pineapples, sweet corns, zucchini on top of Mozzarella cheese",
				"Grilled chicken, oven-baked onions, mushroom and sweet corn on a Pesto sauce base mixed with black pepper, covered by melted mozzarella cheese then rolled in Pizza Hut's signature pizza dough.",
				"Crispy bacon, oven-baked onions and sweet&sour pineapple on bed of signature Cheesy Sauce, topped with mozzarella cheese then rolled in Pizza Hut's signature pizza dough.",
				"Grilled beef combined with onions, bell peppers on black pepper sauce, topped with mozzarella cheese and fresh basil leaves, rolled in Pizza Hut's signature pizza dough",
				"Shrimp, squid and mushrooms on a bed of signature Pesto sauce, topped with Mozzarella cheese",
				"Shrimps, squids, pineapples, crabsticks, onions on a bed of hot black pepper sauce and topped with Mozzarella cheese",
				"Shrimps, onions, capsicums on top of Garlic-parsley Butter sauce",
				"Traditional pizza with beef, bacon, pepperoni, capsicums, mushrooms, onions and Mozzarella chees",
				"Enjoy a tasty, protein-packed serving of bacon, sausage, beef, ham and pepperoni",
				"Black olives, fresh cherry tomatoes, mushrooms, pineapples, sweet corns, zucchini on top of Mozzarella cheese",
				"Chicken Deluxe Pizza with chicken breast, mushroom, pineapple, carrot and cress layered on top of our black pepper sauce",
				"Hawaiian-flavored pizza with hams and pineapples",
				"Squids, crab sticks, pineapples, capsicums on top of Cheesy Mayo sauce and Mozzarella cheese",
				"Pepperoni with Mozzarella cheese",
				"Chicken Deluxe Pizza with chicken breast, mushroom, pineapple, carrot and cress layered on top of our black pepper sauce",
				"Beef, pineapples, sprouts, sesames in Korean spicy sauce base",
		};

		String imgString = "https://wowthemesnet.github.io/template-fooddelivery-bootstrap-html/img/pizza-1.png";

		int[] pizzaPrice = { 15, 20, 22, 30, 25, 10, 20, 10, 30, 10, 22, 25, 80, 100, 99, 19, 29, 9, 49, 50 };

		for (int i = 0; i < pizzaName.length; i++) {
			Pizza pizza = new Pizza();
			pizza.setName(pizzaName[i]);
			pizza.setImg(imgString);
			pizza.setPrice(pizzaPrice[i]);
			pizza.setDescription(pizzaDescription[i]);
			PizzaDAO.addPizza(pizza);
		}
	}
}
