import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

class Main {

  	public static void main(String... args) {
		List list = new ArrayList();
		Scanner scanner = new Scanner(System.in);
		
		while(true){
		    int	a = scanner.nextInt();
			switch(a){
			case 1 : 	
			  list.add(new byte[1024*1024*10]);
			  System.out.println("10mb Aded");
			  break;
			case 2:
			  if(!list.isEmpty()){
			  list.remove(0);
			  System.out.println("10mb Removed");
			  }
			  break;
			case 3:
			  System.gc();
			  System.out.println("GC was called");
			  break;
			}
		}
	}

}
