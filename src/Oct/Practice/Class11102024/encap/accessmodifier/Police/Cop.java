package Oct.Practice.Class11102024.encap.accessmodifier.Police;

public class Cop {
    private String idCard;
    private int gun;

    public Cop(int gun) {
        //this.idCard = idCard;
        this.gun = gun;
    }

    protected void canIShoot(){
        System.out.println("Yes, You Can!!!");
    }
}
