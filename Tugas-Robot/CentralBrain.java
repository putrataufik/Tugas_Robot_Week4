import java.util.ArrayList;

public class CentralBrain extends Robot implements CombiningRobot {

    private ArrayList<Robot> componentRobots; // list of component robots in the larger robot
    private int power;
    private int hp;
    
    public CentralBrain(String name, int maxHealth, int power, int hp) {
        super(name, "central", maxHealth, power);
        this.componentRobots = new ArrayList<Robot>();
        this.power = power;
        this.hp = hp;
    }
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public int getPower() {
        return power;
    }
    public void statusRobot(){
        System.out.println();
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public void combine(Robot robot) {
        this.componentRobots.add(robot);
        System.out.println(robot.getRobotName()+ " Telah Bergabung ke Robot Utama");
    }
    @Override
    public void separate(Robot robot) {
        this.componentRobots.remove(robot);
        System.out.println(robot.getRobotName()+ " Telah Berpisah Dari Robot Utama");
    }
    // method to get the list of component robots in the larger robot
    public ArrayList<Robot> getComponentRobots() {
        System.out.println("Component Robots:");
        return this.componentRobots;
    }

    // method to control the movements and weapons of the component robots
    public void controlComponentRobots() {
        
    }

    @Override
    void move() {
        System.out.println("Robot Besar Melakukan gerakan dengan Gesit dan Lincah");
    }

    @Override
    void attack() {
        System.out.println("Robot Besar menyerang monster dan memberikan demage sebesar "+getPower());
    }

    @Override
    void defend() {
        System.out.println("Robot Besar Bertahan dari serangan monster");
    }

    @Override
    void heal(int heal) {
        System.out.println("Robot Besar Melakukan Heal sebesar "+heal);
    }

    @Override
    public void communicate(Robot dari, String pesan, Robot tujuan) {
        System.out.println(pesan+" dari : "+ dari.getRobotName()+" ke : "+tujuan.getRobotName());
    }

    public void monster(int attack, Robot siapa){
        int hasil = siapa.getHp()-attack;
        siapa.setHp(hasil);
        System.out.println("Monster menyerang "+siapa+ " dengan demage sebesar "+attack);
    }
    
}
