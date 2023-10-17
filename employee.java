package polymophism;


public class employee {

	 public void work()
	 {
		System.out.println("running employee"); 
	 }
	 static void display(employee e1)
	 {
		e1.work(); 
	 }
	 public static void main(String[] args) {
		 employee.display(new developer());
	}

}
