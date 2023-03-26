import org.w3c.dom.ranges.Range;

public class RobotClient {
    public static void main(String[] args) {
        // memanggil object robot kecil
         RobotMelle meleeRobot1 = new RobotMelle("John Supardi", "Melle", 25, 25, 40, "Samurai");
         RobotRange rangedRobot1 = new RobotRange("Alexanuddin", "Range", 25, 25, 20, "Pistol");
         RobotSupport supportRobot1 = new RobotSupport("Tom Kusuma", "Support", 25, 25, 15, 1);
         RobotMelle meleeRobot2 = new RobotMelle("ilham smith", "Melle", 25, 25, 40, "katana");
         RobotRange rangedRobot2 = new RobotRange("Ardinotaheru", "Range", 25, 25, 25, "Rpg");
         
        // robot kecil bergerak
        meleeRobot1.move();
        rangedRobot1.move();
        supportRobot1.move();
        meleeRobot2.move();
        rangedRobot2.move();

        //robot kecil beraksi
        meleeRobot1.attack();
        meleeRobot2.defend();
        supportRobot1.healing();


        // menjalankan robot pusat
        CentralBrain pusat = new CentralBrain("RobotBesar", 100, 50, 100);
        pusat.combine(meleeRobot1); // robot kecil di combine
        pusat.combine(rangedRobot1); // robot kecil di combine
        pusat.combine(supportRobot1); // robot kecil di combine
        pusat.combine(meleeRobot2); // robot kecil di combine
        pusat.combine(rangedRobot2); // robot kecil di combine
        System.out.println("cek comunicate");
        pusat.communicate(rangedRobot1,"Hallo saya sudah Bergabung",pusat);// Kalo langsung ke pusat berarti seperti chat all
        pusat.communicate(rangedRobot1,"Hallo John Supardi",meleeRobot1);// chat direct;
        pusat.getComponentRobots().forEach(robot -> System.out.println(robot.getRobotName()+" ("+robot.getRobotType()+")")); //print component Robot Besar uang baru di tambahkan
        pusat.separate(rangedRobot2); // // robot kecil di separate
        pusat.getComponentRobots().forEach(robot -> System.out.println(robot.getRobotName()+" ("+robot.getRobotType()+")")); //print component Robot Besar uang baru di pisahkan
        
        pusat.attack(); // function attack dari pusat
        pusat.heal(20); // function heal dari pusat
        pusat.move(); // function move dari pusat
        pusat.defend(); // function defend dari pusat

        pusat.monster(10, pusat); // monster menyerang (Jumlah Demage, Target siapa)
        pusat.monster(10, pusat); // monster menyerang (Jumlah Demage, Target siapa)
        System.out.println("Hp dari Robot besar "+pusat.getHp());
    }
}

