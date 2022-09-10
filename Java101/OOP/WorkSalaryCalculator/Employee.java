package OOP.WorkSalaryCalculator;

/**
 * @author Ali Yavuz YALCIN
 */
public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax(){
        double taxedSalary = 0;
        if(this.salary > 1000){
            taxedSalary = this.salary * 0.03;
            return taxedSalary;
        }else{
            return 0;
        }
    
    }

    int bonus(){
        int overWorkHours = 0;
        int bonusPrice = 0;
        if(this.workHours > 40){
            overWorkHours = this.workHours - 40;
            bonusPrice = overWorkHours * 30;
            return bonusPrice;
        }else{
            return 0;
        }
    }

    double raiseSalary(){
        int today = 2021;
        int subtraction = today - this.hireYear;
        double raise = 0;

        if(subtraction < 10){
            raise = this.salary * 0.05;
            return raise;
        }else if(subtraction > 9 && subtraction < 20){
            raise = this.salary * 0.10;
            return raise;
        }else if(subtraction > 19){
            raise = this.salary * 0.15;
            return raise;
        }
        return 0;
    }
    
    double netSalary(){
        double netSalary = totalSalary() - tax();
        return netSalary;
    }

    double subSalary(){
        double subSalary = (this.salary + bonus()) - tax();
        return subSalary;
    }

    double totalSalary(){
        double totalSalary = this.salary + raiseSalary();
        return totalSalary;
    }
    
    public String toString(){
        
        return "Name: " + this.name + "\nSalary: " + this.salary + "\nHours of Work: " + this.workHours 
            + "\nHire Year: " + this.hireYear + "\nTax: " + tax() + "\nBonus: " + bonus() + "\nSalary Raise: " + raiseSalary() 
            + "\nSalary with Tax and Bonus: " + subSalary() + "\nTotal Salary: " + totalSalary();
    }
}
