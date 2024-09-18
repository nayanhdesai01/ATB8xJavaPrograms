//Print  lines of output; each line  (where ) contains the  of  in the form:
//N x i = result.

package Sept.PraticePrograms;
public class PP001_Table {
    public static void main(String[] args){
int num= 2;

        System.out.println("Table of"+num);
        for(int i=1;i<=10;i++){
            System.out.printf("%d\tx\t%d\t=\t%d\n",num,i,num*i);
        }
        System.out.println("Complete");
    }
}
