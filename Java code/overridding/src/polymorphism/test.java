
package polymorphism;
public class test {
   public static void main(String[]args){
      person p=new person();
      p.DisplayInformation();
      p=new teacher();
      p.DisplayInformation();
      p= new student();
      p.DisplayInformation();
       }
}
