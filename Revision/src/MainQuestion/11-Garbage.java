package MainQuestion;


class Employee{

    public int empId;
    public String empName;


    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finallize is called Right now ");
    }

}


class MainUser {
    public static void main(String[] args) {

        Employee obj = new Employee();

        obj.empId = 5;
        obj.empName = "Rehan";

        obj = null;
        System.gc();

        System.out.println("Program Completed");
    }
}
