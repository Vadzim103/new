import java.io.*;

class Test {
	int mmm;
	int all_count = 0;
	public void readline(){
		
    try (BufferedReader reader = new BufferedReader(
            new InputStreamReader(
                    new FileInputStream("F://input2.txt")))){
       
       String line = reader.readLine();
       mmm = Integer.parseInt(line);  	
        
        
    } catch (IOException e) {
    	System.out.println("error");
    }
	}
	
	public void calculate(){
		int count = 0;
		String b;
		int i=1;
		while(count<mmm){
		   //т.к. максимальная длина ряда 10000 то принимаем что максимальное число не содержащее двух и более одинаковых
	       //цифр - это 9876 и оно из 4 символов
           b = String.valueOf(i);
           if(i<10){
        	   count++;
           }
           if(i>=10 & i<100){           
           int w = b.charAt(0);
           int x= b.charAt(1);
        	   if(w!=x){
        	   count++;
        	   }
           }
           if(i>=100 & i<1000){
        	   int w = b.charAt(0);
               int x= b.charAt(1);
               int y = b.charAt(2);
        	   if(w!=x ^ w!=y ^ x!=y){
        	       count++;  
        	   }
           }
           if(i>=1000 & i<10000){
        	   int w = b.charAt(0);
               int x= b.charAt(1);
               int y = b.charAt(2);
               int v = b.charAt(3);
        	   if(w!=x ^ w!=y ^ w!=v ^ x!=y ^ x!=v ^ y!=v){
        	   count++;
        	   }
           }
    	   all_count++;
           i++;
		}
		System.out.println("Входящее значение:");
		System.out.println(count);
		System.out.println("Полученное значение:");
		System.out.println(all_count);
		
	}

	public void write(){
		try {
		    BufferedWriter out = new BufferedWriter(
		        new FileWriter("F://output2.txt"));
		    out.write("\n"+all_count);
		    out.close();
		} catch (IOException e) {
		    e.printStackTrace();
		}	
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		t.readline();
		t.calculate();
		t.write();
	}
	
}