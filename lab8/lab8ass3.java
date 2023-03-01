class Employee {
    int empID;
    int deptID;

    Employee(int empID, int deptID) {
        this.empID = empID;
        this.deptID = deptID;
    }

    public double calamt(int dayno) {
        return 0;
    }
}

class Worker extends Employee {
    public Worker(int empID, int deptID) {
        super(empID, deptID);
    }

    public double calamt(int dayno) {
        return 500 * dayno;
    }
}

class Manager extends Employee {
    public Manager(int empID, int deptID) {
        super(empID, deptID);
    }

    public double calamt(int dayno) {
        return 400 * Math.ceil(dayno / 2.0);
    }
}

class Other extends Employee {
    public Other(int empID, int deptID) {
        super(empID, deptID);
    }

    public double calamt(int dayno) {
        return 600 * dayno;
    }
}

public class lab8ass3 {
    public static void main(String[] args) {

        Worker worker = new Worker(101, 1);
        double leaveAmount = worker.calamt(7);
        System.out.println("Leave amount for worker: Rs " + leaveAmount);
        Manager manager = new Manager(102, 2);
        leaveAmount = manager.calamt(10);
        System.out.println("Leave amount for manager: Rs " + leaveAmount);

        Other other = new Other(103, 3);
        leaveAmount = other.calamt(10);
        System.out.println("Leave amount for other employee: Rs " + leaveAmount);
    }
}
