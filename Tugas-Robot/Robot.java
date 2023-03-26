/**
 * Robot
 */
public abstract class Robot {
    private String robotName;
    private String RobotType;
    private int hp;
    private int hpMax;
    private int power;
    public Object getRobotName;  

    public void setRobotName(String robotName) {
        this.robotName = robotName;
    }
    public void setRobotType(String robotType) {
        RobotType = robotType;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public void setHpMax(int hpMax) {
        this.hpMax = hpMax;
    }
    public void setPower(int power) {
        this.power = power;
    }
    public String getRobotName() {
        return robotName;
    }
    public String getRobotType() {
        return RobotType;
    }
    public int getHp() {
        return hp;
    }
    public int getHpMax() {
        return hpMax;
    }
    public int getPower() {
        return power;
    }
    public Robot(String robotName, String robotType, int hp, int hpMax) {
        this.robotName = robotName;
        RobotType = robotType;
        this.hp = hp;
        this.hpMax = hpMax;
        this.power = power;
    }
     abstract void move();
     abstract void attack();
     abstract void defend();
     abstract void heal(int heal);
     public void communicate(Robot dari,String pesan, Robot tujuan){

     }
    
}