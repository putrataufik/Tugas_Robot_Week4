public class RobotSupport extends Robot{

    private int healing;
    public int getHealing() {
        return healing;
    }
    public void setHealing (int healing){
        this.healing = healing;
    }

    public RobotSupport(String robotName, String robotType, int hp, int hpMax, int power, int healing) {
        super(robotName, robotType, hp, hpMax);
        //TODO Auto-generated constructor stub]
        this.healing = healing;
    }

    @Override
    void move() {
        System.out.println(getRobotName() + " Bertipe " +super.getRobotType()+ " Bergerak ");
    }

    @Override
    void attack() {
        System.out.println(getRobotName() + " Bertipe " +super.getRobotType()+ " Menyerang Menggunakan Basic Attack");
    }

    @Override
    void defend() {
        System.out.println(getRobotName() + " Bertipe " +super.getRobotType()+ " melakukan Defend");
    }

    @Override
    void heal(int heal) {
        System.out.println(getRobotName() + " Bertipe " +super.getRobotType()+ " melakukan Heal");
    }

    void healing(){
        setHp(getHp()+getHealing());
        System.out.println(getRobotName() + " Bertipe " +super.getRobotType()+ " melakukan Heal"+ " sebanyak = " + getHealing());
    }
}