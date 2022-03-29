import java.util.Scanner;

public class CalTax50 {
        private static Double totalTax;

        public CalTax50() {
                int parents, childs;
                char married_status;
                double salary, totalExpense = 0, totalSalary = 0;
                Scanner scan = new Scanner(System.in);
                System.out.print("Are you married? (y/n) : ");
                married_status = scan.next().charAt(0);
                System.out.print("Enter all of your parents : ");
                parents = scan.nextInt();
                System.out.print("Enter your childs : ");
                childs = scan.nextInt();
                System.out.print("Enter your salary : ");
                salary = scan.nextDouble();
                salary = salary * 12;
                if (married_status == 'y') {
                        if (parents <= 4) {
                                parents *= 30000;
                                totalExpense += parents;
                        }
                        if (childs <= 3) {
                                childs *= 30000;
                                totalExpense += childs;
                        }
                        totalSalary = salary - totalExpense;
                } else {
                        if (parents <= 2) {
                                parents *= 30000;
                                totalExpense += parents;
                        }
                        if (childs <= 3) {
                                childs *= 30000;
                                totalExpense += childs;
                        }
                        totalSalary = salary - totalExpense;
                }
                calTax(totalSalary);
                System.out.println(getTotalTax());
        }

        public Double getTotalTax() {
                return totalTax;
        }

        public void setTotalTax(Double totalTax) {
                CalTax50.totalTax = totalTax;
        }

        public void calTax(Double totalSalary) {
                double tax = 0;
                if (totalSalary > 10000001){
                        tax = totalSalary * 0.4;
                }
                else if ((totalSalary >= 6000001) && (totalSalary <= 10000000)){
                        tax = totalSalary * 0.3;
                }
                else if ((totalSalary >= 3000001) && (totalSalary <=  6000000)){
                        tax = totalSalary * 0.2;
                }
                else if ((totalSalary >= 1500001) && (totalSalary <= 3000000)) {
                        tax = totalSalary * 1.5;
                }
                else if ((totalSalary >= 700001) && (totalSalary <= 1500000)) {
                        tax = totalSalary * 1;
                }
                else if ((totalSalary >= 300001) && (totalSalary <= 700000)) {
                        tax = totalSalary * 0.05;
                }
                else if ((totalSalary >= 150001) && (totalSalary <= 300000)) {
                        tax = totalSalary * 0.03;
                }
                else if (totalSalary <= 150001) {
                        tax = 0;
                }
                setTotalTax(tax);
        }        
}