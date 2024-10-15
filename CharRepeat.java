//aabbbcc a2b3c2
//hassam h1a2s2m1

import java.util.*;
public class MyClass {
  public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
  String str=sc.nextLine();
  char ch[]=str.toCharArray();
  int count;
  for(int i=0;i<str.length();i++){
      count=1;
      for(int j=i+1;j<str.length();j++)
      {
      if(ch[i]==ch[j]){
          count++;
          ch[j]='/';
      }
       
      }
      if(ch[i]!='/'){
        System.out.print(ch[i]+""+count);}
  }
  
  }
}
