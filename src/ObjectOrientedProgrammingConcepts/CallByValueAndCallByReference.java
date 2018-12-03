package ObjectOrientedProgrammingConcepts;

public class CallByValueAndCallByReference {
	
	int p,q;

	public static void main(String[] args) {
		
		CallByValueAndCallByReference obj = new CallByValueAndCallByReference();
		int x =20;
		int y = 30;
		
		obj.sum(x,y); // call by value OR call by value
		
		obj.p = 10;
		obj.q = 20;
		
		obj.swap(obj);
		System.out.println(obj.p);
		System.out.println(obj.q);
	
	}

	
	public int sum(int a, int b){
		int c = a+b;
		return c;
		
	}
	
	public void swap(CallByValueAndCallByReference e){
	
		int temp;
		temp = e.q;
		e.q = e.p;	//e.q = 10
		e.p = temp; //e.p = 20
		
		
		
		
	}
}
