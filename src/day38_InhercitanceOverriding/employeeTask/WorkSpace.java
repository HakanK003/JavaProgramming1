package day38_InhercitanceOverriding.employeeTask;

public class WorkSpace {

    public static void main(String[] args) {

        BusinessAnalyst businessAnalyst1 = new BusinessAnalyst("Aaa","Apple",30,123,120000,'M');
        Developer developer1 = new Developer("Bbb","Amazon",28,122,165000,'M');
        Driver driver1 = new Driver("Ccc","Uber",22,110,60000,'M');
        Pilot pilot1 = new Pilot("Ddd","Pegasus",35,133,130000,'M');
        ProductOwner productOwner1 = new ProductOwner("Eee","Microsoft",29,111,135000,'F');
        ScrumMaster scrumMaster1 = new ScrumMaster("Fff","Meta",31,143,140000,'F');
        Teacher teacher1 = new Teacher("Ggg","asdf",30,134,120000,'F');
        Tester tester1 = new Tester("Hhh","Apple",18,333,130000,'M');

        businessAnalyst1.work();
        developer1.work();
        driver1.work();
        pilot1.work();
        productOwner1.work();
        scrumMaster1.work();
        teacher1.work();
        tester1.work();

        System.out.println(businessAnalyst1);
        System.out.println(developer1);
        System.out.println(driver1);
        System.out.println(pilot1);
        System.out.println(productOwner1);
        System.out.println(scrumMaster1);
        System.out.println(teacher1);
        System.out.println(tester1);


    }

}
