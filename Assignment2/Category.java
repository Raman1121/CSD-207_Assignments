package Assignment2;
import java.util.*;

public class Category {
	/*This class will contain objects of the Items class.
	 * Following methods are to be created:-
	 * 		getCategory() => to know the name of the category
	 * 		getItems() => this will make a call to another function in the Items class to display all the items in a particular category.(will pass the category name in the function.
	 *		addCategory() => this will allow the shopkeeper to add another category to the already existing list.
	 *		removeCategory() => to remove a category
	 *		modifyCategory() => to add or delete elements of a particular category. Will call a suitable function from the Items() class. *params*  Category name
	*/
	String cat_name;
	ArrayList<Category> cat_list = new ArrayList<>();
}
