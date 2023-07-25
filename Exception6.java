 
 import java.io.*;
 
 class Exception6 {
    
    public static void main(String[] args)throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(str);
        br.readLine();
        br.close();

        String str2 = br.readLine();
        System.out.println(str2);
        
    }
}
