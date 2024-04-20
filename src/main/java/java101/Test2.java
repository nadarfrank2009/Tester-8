package java101;

class Test2{  

	int id=5;//field or data member or instance variable  
	String name="Frank";  

	public static void main(String args[]){   
		Test2 s1=new Test2();//creating an object of Student  
		System.out.println(s1.id);//accessing member through reference variable  
		System.out.println(s1.name);  
	}  
}  