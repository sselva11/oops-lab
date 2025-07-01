package test;

public class genclass<T,U>{
	T obj1;  // An object of type T
    U obj2;  // An object of type U

    // constructor
    genclass(T obj1, U obj2)
    {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    // To print objects of T and U
    public void print()
    {
        System.out.println(obj1);
        System.out.println(obj2);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		genclass<String, Integer> obj =new genclass<String, Integer>("GfG", 15);

		        obj.print();
	}

}
