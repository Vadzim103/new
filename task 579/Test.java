import java.io.*;
import java.util.*;

class Test {
	int mmm;
	int nnn;
	public void readline(){
		System.out.println ("введите длину подпоследовательности:");
		Scanner sc = new Scanner(System.in);
		nnn = sc.nextInt();
		
    try (BufferedReader reader = new BufferedReader(
            new InputStreamReader(
                    new FileInputStream("F://input1.txt")))){
        String line;
        int count = 0;
        while ((line = reader.readLine()) != null) {
        	if (count==0){
        		String[] mas = line.split("\\s+");
                int m = Integer.parseInt(mas[0]);
                mmm = m;
        	}
        	if (count==1){
        		FileWriter writer = new FileWriter("F://output1.txt");
        		String [] mas = line.split("\\s+");
        		String [] mas2= line.split("\\s+");
        		
        	        for (int i = 0; i < mas.length; i++) {
        	            Integer.parseInt(mas[i]);
        	        }
        	        for (int i = 0; i < mas2.length; i++) {
        	            Integer.parseInt(mas2[i]);
        	        }
        	        
        		Arrays.sort(mas,Collections.reverseOrder());
        		writer.write("\n"+nnn);
        		writer.append("\n");
        		
        		System.out.println(nnn);
        		
        		for (int j = 0;j < nnn;j++){
        			String a = mas[j];
                    int b = Arrays.asList(mas2).indexOf(a);
                    int c = b+1;
                    writer.write(c);
                    writer.write(" ");
                    System.out.print(c);
                    System.out.print(" "); 
                    
        		}
        		writer.close();
        	}
        	count++;		
        }
        
    } catch (IOException e) {
    	System.out.println("error");
    }
	}

	public static void main(String[] args) {
		Test t = new Test();
		t.readline();	
	}
	
}