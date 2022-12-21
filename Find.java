import java.util.Scanner;
class Find
{
 public static void main(String args[])
{
  Scanner sc= new Scanner(System.in);
  int t = sc.nextInt();
  while(t-->0){
  String s1 = sc.next();
   int l=0,u=0,n=0,s=0;
for(int i=0; i<s1.length();i++)
{
 char ch =s1.charAt(i);
  if (ch>='A' && ch<='Z')
       u++;
   else
     if(ch>='a' && ch<='z')
       l++;
   else
     if(ch>='0' && ch<='9')
      n++;
    else
         s++;
}
   System.out.println("Upper="+u);
    System.out.println("lower="+l);
    System.out.println("Num="+n);
    System.out.println("Sym="+s);
  }
}
}