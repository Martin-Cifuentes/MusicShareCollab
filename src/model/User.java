package model;
public class User{
	private String name;
	private String password;
	private int age;
	private Category aCategory;
	private int sharedSongs;
	/** 
     * this constructor method creates a user objet
     * @param n String, the name of the user
     * @param p String, the password of the user
     * @param a int, the age of the user
     * @param c Category, the category of the user
     */
	public User(String n, String p, int a, Category c){
		this.name = n;
		this.password = p;
		this.age = a;
		this.aCategory = c;
		this.sharedSongs = 0;
	}
	public void increaseSharedSongs(){
		sharedSongs++;
		defineCategory();
	}
	public void defineCategory(){
		switch(sharedSongs){
			case 3: aCategory = Category.LITTLE_CONTRIBUTOR;
			break;
			case 10: aCategory = Category.MILD_CONTRIBUTOR;
			break;
			case 30: aCategory = Category.STAR_CONTRIBUTOR;
			break;
			default:
			break;
		}
	}
	/** 
     * this method swous the information of the user
     * <b>pre:</b> it must have been called by a method on msc
     * <b>post:</b> the user information
     * @return String, the user information
     */
	//toString
	public String toString(){
		return "*************  User **************" + "\n**  UserName: " + name + "\n**  Age: " +  age + "\n**  Category: " + aCategory;
	}
	//gets
	public String getName(){
		return this.name;
	}
	public String getPassword(){
		return this.password;
	}
	public int getAge(){
		return this.age;
	}
	public Category getCategory(){
		return this.aCategory;
	}
	//sets
	public void setName(String n){
		this.name = n;
	}
	public void setPassword(String p){
		this.password = p;
	}
	public void setAge(int a){
		this.age = a;
	}
	public void setCategory(Category c){
		this.aCategory = c;
	}
	
}
