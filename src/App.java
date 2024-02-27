import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static String masterFile = "src\\MasterFile.txt";
    public static String transactionFile = "src\\Transactions.txt";
    public static String reportFile = "src\\ReportFile.txt";

    public static void main(String[] args) throws Exception {
    System.out.println("*The sections in order are Part ID, Part Name, Quantity on Hand, Order Point, and Site");
    System.out.println("Stock Count");
    System.out.println("------------");

    File vfile = new File(masterFile);
    Scanner computFile= new Scanner(vfile);  //compf = computer file
    String [] master= new String [110];   
    int a=0;
    int b=5;
    
    for(int i=0; i<110; i++) {//Finds words 
        master[i]=computFile.next();
    }

    for(int j=0; j<22; j++) { //Vertical (How many iterations down)
        for(int k=a; k<b; k++) {  //Individual Horizontal Word
            System.out.print(master[k]+" ");   
        }
        a+=5;
        b+=5;
        System.out.println();
    } 
    System.out.println();  

    File vfile1 = new File("DS7 Transaction.txt");
    Scanner compf1= new Scanner(vfile1);
    String [] transaction= new String [66];
    int a1=0;
    int b1=3;
   
    for(int i=0; i<66; i++) {
        transaction[i]=compf1.next();                //EX. transaction[3] = master[3]
    }
    
    try {
      FileWriter ttom = new FileWriter("DS7 Master File.txt");
      ttom.write(
                 "*"+master[0]+" "+master[1]+" 17 "+master[3]+" "+master[4]+"\n"+
                 master[5]+" "+master[6]+" 30 "+master[8]+" "+master[9]+"\n"+
                 "*"+master[10]+" "+master[11]+" 14 "+master[13]+" "+master[14]+"\n"+
                 master[15]+" "+master[16]+" 0(OOS) "+master[18]+" "+master[19]+"\n"+
                 master[20]+" "+master[21]+" 22 "+master[23]+" "+master[24]+"\n"+
                 "*"+master[25]+" "+master[26]+" 14 "+master[28]+" "+master[29]+"\n"+ //6
                 master[30]+" "+master[31]+" 60 "+master[33]+" "+master[34]+"\n"+
                 master[35]+" "+master[36]+" 8 "+master[38]+" "+master[39]+"\n"+
                 master[40]+" "+master[41]+" 41 "+master[43]+" "+master[44]+"\n"+ //9
                 master[45]+" "+master[46]+" 23 "+master[48]+" "+master[49]+"\n"+
                 master[50]+" "+master[51]+" 19 "+master[53]+" "+master[54]+"\n"+ //11
                 master[55]+" "+master[56]+" 29 "+master[58]+" "+master[59]+"\n"+
                 "*"+master[60]+" "+master[61]+" 1 "+master[63]+" "+master[64]+"\n"+
                 "*"+master[65]+" "+master[66]+" 10 "+master[68]+" "+master[69]+"\n"+
                 master[70]+" "+master[71]+" 84 "+master[73]+" "+master[74]+"\n"+
                 master[75]+" "+master[76]+" 51 "+master[78]+" "+master[79]+"\n"+
                 master[80]+" "+master[81]+" 72 "+master[83]+" "+master[84]+"\n"+
                 master[85]+" "+master[86]+" 85 "+master[88]+" "+master[89]+"\n"+
                 master[90]+" "+master[91]+" 53 "+master[93]+" "+master[94]+"\n"+
                 master[95]+" "+master[96]+" 44 "+master[98]+" "+master[99]+"\n"+
                 master[100]+" "+master[101]+" 5 "+master[103]+" "+master[104]+"\n"+
                 master[105]+" "+master[106]+" 0 (OOS) "+master[108]+" "+master[109]+"\n"); 
      ttom.close();
      System.out.println("Master File......Updated");
    }
    catch(IOException e) {
      e.printStackTrace();
    }

    File vfile2= new File("DS7 Master File.txt");
    Scanner compf2= new Scanner(vfile);  //compf = computer file
    String [] newmaster= new String [110];   //goes 20 spaces down
   
    for(int i=0; i<110; i++) {//Finds words 
         newmaster[i]=compf2.next();
    }

    System.out.println();
    System.out.println();   
    //ID, Name, On Hand, Order point, Job Site
    System.out.println("* = Order More");
    System.out.println("OOS = Out of Stock");
    System.out.println("Atlanta Site");//Lines 0-4, 
    System.out.println("------------");
      
      for(int i=0; i<4; i++) {
         System.out.print(newmaster[i]+" ");
      }
      System.out.println();
      
      for(int i=25; i<29; i++) {
         System.out.print(newmaster[i]+" ");
      }
      System.out.println();
      
      for(int i=50; i<54; i++) {
         System.out.print(newmaster[i]+" ");
      }
      System.out.println();
      
      for(int i=75; i<79; i++) {
         System.out.print(newmaster[i]+" ");
      }
      System.out.println(); 
      System.out.println();
   System.out.println("Albany Site");
   System.out.println("-----------");
   
      for(int i=15; i<19; i++) {
         System.out.print(newmaster[i]+" ");
      }
      System.out.println();
      
      for(int i=40; i<44; i++) {
         System.out.print(newmaster[i]+" ");
      }
      System.out.println();
      
      for(int i=65; i<69; i++) {  
         System.out.print(newmaster[i]+" ");
      }
      System.out.println();
      
      for(int i=90; i<94; i++) {
         System.out.print(newmaster[i]+" ");
      }
      System.out.println();
      System.out.println();
   System.out.println("Decatur Site");
   System.out.println("------------");
   
      for(int i=5; i<9; i++)
      {
         System.out.print(newmaster[i]+" ");
      }
      System.out.println();
      
      for(int i=30; i<34; i++)
      {
         System.out.print(newmaster[i]+" ");
      }
      System.out.println();
      
      for(int i=55; i<59; i++)
      {
         System.out.print(newmaster[i]+" ");
      }
      System.out.println();
      
      for(int i=80; i<84; i++)
      {
         System.out.print(newmaster[i]+" ");
      }
      System.out.println();
      
      for(int i=105; i<109; i++)
      {
         System.out.print(newmaster[i]+" ");
      }
      System.out.println();
      System.out.println();
   System.out.println("Douglasville Site");
   System.out.println("-----------------");
   
      for(int i=10; i<14; i++)
      {
         System.out.print(newmaster[i]+" ");
      }
      System.out.println();
      
      for(int i=35; i<39; i++)
      {
         System.out.print(newmaster[i]+" ");
      }
      System.out.println();
      
      for(int i=60; i<64; i++)
      {
         System.out.print(newmaster[i]+" ");
      }
      System.out.println();
      
      for(int i=85; i<89; i++)
      {
         System.out.print(newmaster[i]+" ");
      }
      System.out.println();
      System.out.println();
   System.out.println("Macon Site");
   System.out.println("----------");
   
      for(int i=20; i<24; i++)
      {
         System.out.print(newmaster[i]+" ");
      }
      System.out.println();
      
      for(int i=45; i<49; i++)
      {
         System.out.print(newmaster[i]+" ");
      }
      System.out.println();
      
      for(int i=70; i<74; i++)
      {
         System.out.print(newmaster[i]+" ");
      }
      System.out.println();
      
      for(int i=95; i<99; i++)
      {
         System.out.print(newmaster[i]+" ");
      }
      System.out.println();
      System.out.println();
      
   System.out.println("-Employees At/Over 40 Hours Across All Sites-");
   System.out.println("------------------------------------------");
   File Pay = new File("DS Employees.txt");
   Scanner file = new Scanner(Pay);
   String [] hourly = new String [140];            
      int a2=0;
      int b2=5;
   //0-4 first iteration
   for(int i=0; i<140; i++)
{
      hourly[i]=file.next();
}
   for(int i=1; i<=2; i++)
{
      System.out.print(hourly[i]+" ");                  //Print file changes like this 
} 
   System.out.print("| ");
   System.out.println("Hours worked ---> "+hourly[4]);
   
    for(int i=11; i<=12; i++)
{
      System.out.print(hourly[i]+" "); 
}
   System.out.print("| ");
   System.out.println("Hours worked ---> "+hourly[14]);
   
   for(int i=21; i<=22; i++)
{
      System.out.print(hourly[i]+" "); 
}
   System.out.print("| ");
   System.out.println("Hours worked ---> "+hourly[24]);
   
   for(int i=31; i<=32; i++)
{
      System.out.print(hourly[i]+" "); 
}
   System.out.print("| ");
   System.out.println("Hours worked ---> "+hourly[34]);
   
   for(int i=41; i<=42; i++)
{
      System.out.print(hourly[i]+" "); 
}
   System.out.print("| ");
   System.out.println("Hours worked ---> "+hourly[44]);
   
   for(int i=51; i<=52; i++)
{
      System.out.print(hourly[i]+" "); 
}
   System.out.print("| ");
   System.out.println("Hours worked ---> "+hourly[54]);
   
   for(int i=56; i<=57; i++)
{
      System.out.print(hourly[i]+" "); 
}
   System.out.print("| ");
   System.out.println("Hours worked ---> "+hourly[59]);
   
   for(int i=61; i<=62; i++)
{
      System.out.print(hourly[i]+" "); 
}
   System.out.print("| ");
   System.out.println("Hours worked ---> "+hourly[64]);
   
   for(int i=66; i<=67; i++)
{
      System.out.print(hourly[i]+" "); 
}
   System.out.print("| ");
   System.out.println("Hours worked ---> "+hourly[69]);
   
   for(int i=71; i<=72; i++)
{
      System.out.print(hourly[i]+" "); 
}
   System.out.print("| ");
   System.out.println("Hours worked ---> "+hourly[74]);
   
   for(int i=76; i<=77; i++)
{
      System.out.print(hourly[i]+" "); 
}
   System.out.print("| ");
   System.out.println("Hours worked ---> "+hourly[79]);
   
   for(int i=81; i<=82; i++)
{
      System.out.print(hourly[i]+" "); 
}
   System.out.print("| ");
   System.out.println("Hours worked ---> "+hourly[84]);
   
   for(int i=86; i<=87; i++)
{
      System.out.print(hourly[i]+" "); 
}
   System.out.print("| ");
   System.out.println("Hours worked ---> "+hourly[89]);
   
   for(int i=91; i<=92; i++)
{
      System.out.print(hourly[i]+" "); 
}
   System.out.print("| ");
   System.out.println("Hours worked ---> "+hourly[94]);
   
   for(int i=96; i<=97; i++)
{
      System.out.print(hourly[i]+" "); 
}
   System.out.print("| ");
   System.out.println("Hours worked ---> "+hourly[99]);
   
   for(int i=111; i<=112; i++)
{
      System.out.print(hourly[i]+" "); 
}
   System.out.print("| ");
   System.out.println("Hours worked ---> "+hourly[114]);
   
   for(int i=116; i<=117; i++)
{
      System.out.print(hourly[i]+" "); 
}
   System.out.print("| ");
   System.out.println("Hours worked ---> "+hourly[119]);
   
   for(int i=121; i<=122; i++)
{
      System.out.print(hourly[i]+" "); 
}
   System.out.print("| ");
   System.out.println("Hours worked ---> "+hourly[124]);
   
   for(int i=131; i<=132; i++)
{
      System.out.print(hourly[i]+" "); 
}
   System.out.print("| ");
   System.out.println("Hours worked ---> "+hourly[134]);
   
   for(int i=136; i<=137; i++)
{
      System.out.print(hourly[i]+" "); 
}
   System.out.print("| ");
   System.out.println("Hours worked ---> "+hourly[139]);
      
   

    }
}
