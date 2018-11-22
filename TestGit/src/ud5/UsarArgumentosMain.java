package ud5;

public class UsarArgumentosMain {

	public static void main(String[] args) {
		int suma=0;
		
		if(args.length>0) {
			
			for(int i=0;i<5;i++) {
				suma=suma+Integer.parseInt(args[i]);
			}
			System.out.println("La suma es :"+suma);
		
		}else {
		System.out.println("No tengo argumentos");
		}
		
		System.out.println (args.length);
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		
	}

}
