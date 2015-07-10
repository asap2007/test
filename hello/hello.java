package hello;


import java.io.*;


public class hello {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.out.println("Hello, World");
		
		for(int i=0; i<args.length; i++){
			System.out.println(args[i]);
		}
		
	    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    String s;
	    while ((s = in.readLine()) != null && s.length() != 0){
	    	System.out.println(s);
	    	String[] item = s.split("\t");
	    	for(int i = 0; i < item.length; i++)
	    		System.out.println(item[i]);
	    }
	    // An empty line or Ctrl-Z terminates the program
	    


	   
 
	}

}



