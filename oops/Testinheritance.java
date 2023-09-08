//hierarchical inheritance in java example
class Animal
{
	public void eat(){
		System.out.println("eating.....");
	}
}
class Dog extends Animal
{
	public void bark(){
		System.out.println("barking....");
	}
}
class Cat extends Animal
{
	public void meow(){
		System.out.println("meowing....");
	}
}
class Testinheritance
{
	public static void main(String []args){
	Cat c=new Cat();
	Dog d=new Dog();
	d.eat();	//calling its parent 
	d.bark();	//calling its local
	c.eat();	//calling its parent 
	c.meow();	//calling its local
	}
	
}
