public class RobotRange extends Robot{

    private String sniper;
    public RobotRange(String robotName, String robotType, int hp, int hpMax, int power, String sniper) {
        super(robotName, robotType, hp, hpMax);
        //TODO Auto-generated constructor stub
        this.sniper = sniper;
    }
    public String getSniper() {
        return sniper;
    }
    public void setSniper(String sniper) {
        this.sniper = sniper;
    }
    @Override
    void move() {
        System.out.println(getRobotName() + " Bertipe " +super.getRobotType()+ " Bergerak ");
    }

    @Override
    void attack() {
        System.out.println(getRobotName() + " Bertipe " +super.getRobotType()+ " Menyerang Menggunakan "+sniper);
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