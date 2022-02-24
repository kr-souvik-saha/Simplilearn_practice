package abc;

class Std{
	int id;
	String name;

	Std(int i,String n)
	{
	id=i;
	name=n;
	}

	void display() {
	System.out.println(id+" "+name);
	}
}

public class ConstructerExample1 {
public static void main(String[] args) {

	Std std1=new Std(23,"Souvik");
	Std std2=new Std(100,"Raju");
	std1.display();
	std2.display();
		}
}


