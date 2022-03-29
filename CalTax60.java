import java.util.Scanner;

public class CalTax60 extends CalTax50 {
        public CalTax60() {
                int parents, childs;
                char married_status, rmf,social,provident,dis;
                double salary, totalExpense = 0, totalSalary = 0,rmf_invest,
                        social_security_fund,provident_fund,age,age_expense;
                Scanner scan = new Scanner(System.in);
                System.out.print("Are you married? (y/n) : ");
                married_status = scan.next().charAt(0);
                System.out.print("Enter all of your parents : ");
                parents = scan.nextInt();
                System.out.print("Enter your childs : ");
                childs = scan.nextInt();
                System.out.print("Enter your salary : ");
                salary = scan.nextDouble();
                System.out.print("Invest in RMF fund? (y/n) : ");
                rmf = scan.next().charAt(0);
                if (rmf == 'y' || rmf == 'Y'){
                        System.out.print("How many you invest in RMF fund? : ");
                        rmf_invest = scan.nextDouble();
                        if (rmf_invest > 50000){
                                rmf_invest = 50000;
                                totalExpense += rmf_invest;
                        } else {
                                totalExpense += rmf_invest;
                        }
                }
                System.out.print("Pay social security fund? (y/n) : ");
                social = scan.next().charAt(0);
                if (social == 'y' || social == 'Y') {
                        social_security_fund = 750*12;
                        totalExpense += social_security_fund;
                }
                System.out.print("Invest in provident fund? (y/n) : ");
                provident = scan.next().charAt(0);
                if (provident == 'y' || provident == 'Y') {
                        System.out.print("How many do you invest in provident fund? (4%-10%) : ");
                        provident_fund = scan.nextDouble();
                        provident_fund = provident_fund/100;
                        provident_fund = salary * provident_fund; 
                        totalExpense += provident_fund;
                }
                System.out.print("Enter your age : ");
                age = scan.nextDouble();
                System.out.print("Are you disability? (y/n) : ");
                dis = scan.next().charAt(0);
                if (age > 60 || dis == 'y'){
                        age_expense = 190000;
                        totalExpense += age_expense;
                }
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
}
