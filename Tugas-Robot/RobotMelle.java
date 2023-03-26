/**
 * RobotMelle
 */
public class RobotMelle extends Robot{
    private String pedang;
    
    public RobotMelle(String robotName, String robotType, int hp, int hpMax, int power, String pedang) {
        super(robotName, "Robot Melle", hp, hpMax);
        this.pedang = pedang;
    }

    public String getPedang() {
        return pedang;
    }
    public void setPedang(String pedang) {
        this.pedang = pedang;
    }

    @Override
    void move() {
        System.out.println(getRobotName() + " Bertipe " +super.getRobotType()+ " Bergerak ");
    }

    @Override
    void attack() {
        System.out.println(getRobotName() + " Bertipe " +super.getRobotType()+ " Menyerang Menggunakan "+pedang);
    }

    @Override
    void defend() {
        System.out.println(getRobotName() + " Bertipe " +super.getRobotType()+ " melakukan Defend");
    }

    @Override
    void heal(int heal) {
        System.out.println(getRobotName() + " Bertipe " +super.getRobotType()+ " melakukan Heal");
    }

}