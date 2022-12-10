/**
	 * Class Entree
 	 * author : kathryn bager
	 * created: 10/17/2022
	 */

package assignment1;
public class Entree {
private String name;
private String description;
private int calories = 0;
public Entree(String name, String description, int cal) {
this.name = name;
this.description = description;
this.calories = cal;
}
public Entree() {
	// TODO Auto-generated constructor stub
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public String getDescription() {
return description;
}
public void setDescription(String description) {
this.description = description;
}
public int getCalories() {
return calories;
}
public void setCalories(int calories) {
this.calories = calories;
}		
}