package Oct.ClassPractice.Class16102024;

public class Lab157 {
    public static void main(String[] args) {
        System.out.println(Color.RED.getHexcode());
        System.out.println(Color.GREEN.getHexcode());

        if(Color.BLUE.getHexcode()=="#3377FF"){
            System.out.println("Color is Blue");
        }
    }
}


enum Color{
    RED("#FF0000"),
    GREEN("#61FF33"),
    BLUE("#3377FF");

    private String hexcode;

    private Color(String hexcode){
        this.hexcode = hexcode;
    }

    public String getHexcode(){
    return this.hexcode;
    }
}