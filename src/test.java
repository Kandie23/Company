public class test {

    public static void main(String[] args){

        Employee employee = new Employee();
        Lawyer lawyer = new Lawyer();
        Secretary secretary = new Secretary();
        Legalsecretary legalsecretary = new Legalsecretary();
        Marketer marketer = new Marketer();

        System.out.println(employee.getVacation());
        System.out.println(lawyer.getLawyerPosition());
        System.out.println(secretary.getVacation());
        System.out.println(legalsecretary.getVacation());
        System.out.println(marketer.insideMarket());


    }
}
