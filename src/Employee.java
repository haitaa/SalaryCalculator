public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        double tax = 0;
        if(this.salary <= 1000) {
            return tax;
        } else {
            tax = (this.salary * 0.03);
            return tax;
        }
    }

    public double bonus() {
        double bonus = 0;
        if(this.workHours > 40) {
            for(int i = 40; i<this.workHours; i++) {
                bonus += 30;
            }
        }
        return bonus;
    }

    public double raiseSalary() {
        double raise = 0;
        int year = 2023;
        if((year - this.hireYear) < 10) {
            raise += this.salary * 0.05;
            return raise;
        } else if((year - this.hireYear) > 9 && (year - this.hireYear) < 20){
            raise += this.salary * 0.10;
            return raise;
        } else {
            raise += this.salary * 0.15;
            return raise;
        }
    }

    public void toString1() {
        System.out.println("Adı: " + this.name + "\n" +
                "Maaşı: " + this.salary + "\n" +
                "Çalışma Saati: " + this.workHours + "\n" +
                "Başlangıç Yılı: " + this.hireYear +  "\n" +
                "Vergi: " + this.tax() + "\n" +
                "Bonus: " + this.bonus() +"\n" +
                "Maaş Artışı: " + this.raiseSalary() + "\n" +
                "Vergi ve Bonuslar ile birlikte maaş: " + (this.salary - this.tax() + this.bonus()) + "\n" +
                "Toplam Maaş: " + (this.salary - this.tax() + this.raiseSalary() + this.bonus()));
    }
}
