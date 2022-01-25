
package constractor;

/**
 *
 * @author Mahmud
 */
public class teacher {
    
    String name,id;
    int rool;
    teacher(String name,String id){
        this.name=name;
        this.id=id;
        
    }
    teacher(String name,String id,int rool){
        this.name=name;
        this.id=id;
        this.rool=rool;
        
    }
    void information()
    {
        System.out.println(name);
        System.out.println(id);
        System.out.println(rool);
    }
    
}
