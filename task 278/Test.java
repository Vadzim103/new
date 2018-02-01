import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


public class Test {
	String s;
	String t;
	
	public void write(String string){
		try {
		    BufferedWriter out = new BufferedWriter(
		        new FileWriter("F://output3.txt"));
		    out.write("\n"+string);
		    out.close();
		} catch (IOException e) {
		    e.printStackTrace();
		}	
	}
	
	public void readline(){
	    try (BufferedReader reader = new BufferedReader(
	    new InputStreamReader(
	    new FileInputStream("F://input3.txt")))){
        s = reader.readLine();
        System.out.println(s);
        t = reader.readLine();
        System.out.println(t);
	        
	        
	    } catch (IOException e) {
	    	System.out.println("error");
	    }
		}
	
	public void calculate(){
	int s_index = 0;
	for(int t_index=0; t_index<t.length(); t_index++){
		if(s.charAt(s_index)==t.charAt(t_index)){
			s_index++;
			if(s_index == s.length()){
				System.out.println("YES");
				String string = "YES";
				write(string);
				return;
			}
		}
	}
	System.out.println("NO");
	String string = "NO";
	write(string);
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.readline();
		t.calculate();
	}
}
