package com.mycompany.hrmanagement;

import java.util.*;

public class HRManagement {

    public static void main(String[] args) {
        HRManagement a = new HRManagement();
        a.menu();
    }
    private ArrayList<FullTimeEmployee> Fem = new ArrayList<FullTimeEmployee>();
    private ArrayList<PartTimeEmployee> Pem = new ArrayList<PartTimeEmployee>();

    public void addFullTEm() {
        FullTimeEmployee a = new FullTimeEmployee();
        a.InputInfo();
        Fem.add(a);
    }

    public void addPartTEm() {
        PartTimeEmployee b = new PartTimeEmployee();
        b.InputInfo();
        Pem.add(b);
    }

    public void showFullTEm() {
        for (int i = 0; i < Fem.size(); i++) {
            System.out.println(Fem.get(i).getInfo());
        }
    }

    public void showPartTEm() {
        for (int i = 0; i < Pem.size(); i++) {
            System.out.println(Pem.get(i).getInfo());
        }
    }

    public void showAll() {
        for (int i = 0; i < Pem.size(); i++) {
            System.out.println(Pem.get(i).getInfo());
        }
        for (int i = 0; i < Fem.size(); i++) {
            System.out.println(Fem.get(i).getInfo());
        }
    }

    public void searchEmById() {
        System.out.println("Enter Employee id :");
        Scanner sc = new Scanner(System.in);
        String b;
        b = sc.next();
        for (int i = 0; i < Pem.size(); i++) {
            if (Pem.get(i).getEmployeeID().equals(b)) {
                System.out.println(Pem.get(i).getInfo());
                break;
            }
        }
        for (int i = 0; i < Fem.size(); i++) {
            if (Fem.get(i).getEmployeeID().equals(b)) {
                System.out.println(Fem.get(i).getInfo());
                break;
            }
        }
    }

    public void deleteEmById() {
        System.out.println("Enter Employee id :");
        Scanner sc = new Scanner(System.in);
        String b;
        b = sc.next();
        for (int i = 0; i < Pem.size(); i++) {
            if (Pem.get(i).getEmployeeID().equals(b)) {
                Pem.remove(i);
                break;
            }
        }
        for (int i = 0; i < Fem.size(); i++) {
            if (Fem.get(i).getEmployeeID().equals(b)) {
                Fem.remove(i);
                break;
            }
        }
    }

    public void editEmById() {
        System.out.println("Enter Employee id :");
        Scanner sc = new Scanner(System.in);
        String b;
        b = sc.next();
        for (int i = 0; i < Pem.size(); i++) {
            if (Pem.get(i).getEmployeeID().equals(b)) {
                System.out.println("Employee Name : ");
                Pem.get(i).setEmployeeName(sc.nextLine());
                System.out.println("Employee year of birth : ");
                Pem.get(i).setYearOfBirth(sc.nextInt());
                System.out.println("Employee address : ");
                Pem.get(i).setAddress(sc.next());
                System.out.println("Employee phone : ");
                Pem.get(i).setPhone(sc.next());
                System.out.print("Working Hour : ");
                Pem.get(i).setWorkingHour(sc.nextInt());
                System.out.print("Pay Rate : ");
                Pem.get(i).setPayRate(sc.nextFloat());
                break;
            }
        }
        for (int i = 0; i < Fem.size(); i++) {
            if (Fem.get(i).getEmployeeID().equals(b)) {
                System.out.println("Employee Name : ");
                Fem.get(i).setEmployeeName(sc.nextLine());
                System.out.println("Employee year of birth : ");
                Fem.get(i).setYearOfBirth(sc.nextInt());
                System.out.println("Employee address : ");
                Fem.get(i).setAddress(sc.next());
                System.out.println("Employee phone : ");
                Fem.get(i).setPhone(sc.next());
                System.out.print("Salary : ");
                Fem.get(i).setSalary(sc.nextFloat());
                break;
            }
        }
    }

    public void searchEmByPay() {
        Scanner sc = new Scanner(System.in);
        System.out.println("A range of Payment from :");
        float a = sc.nextFloat();
        System.out.println("to :");
        float b = sc.nextFloat();
        for (int i = 0; i < Pem.size(); i++) {
            if (Pem.get(i).getPayment() >= a & Pem.get(i).getPayment() <= b) {
                System.out.println(Pem.get(i).getInfo());
            }
        }
        for (int i = 0; i < Fem.size(); i++) {
            if (Fem.get(i).getPayment() >= a & Fem.get(i).getPayment() <= b) {
                System.out.println(Fem.get(i).getInfo());
            }
        }
    }

    public void sortByAgeAPayment() {
        HRManagement a = new HRManagement();
        a.sortFullTEm();
        a.sortPartTEm();

    }

    public void menu() {
        int menu;
        HRManagement m = new HRManagement();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.printf("1. Add Full-time Employee\n"
                    + "2. Add Part-time Employee\n"
                    + "3. Show all Full-time Employee \n"
                    + "4. Show all Part-time Employee\n"
                    + "5. Show all Employee\n"
                    + "6. Search Employee by Id \n"
                    + "7. Delete Employee by Id \n"
                    + "8. Edit Employee information by Id \n"
                    + "9. Search Employee by payment \n"
                    + "10. Sort Full-time Employee and Part-Time employee in ascending order by age, payment\n" + ""
                    + "11. Exit \nInput: ");

            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    m.addFullTEm();
                    break;
                case 2:
                    m.addPartTEm();
                    break;
                case 3:
                    m.showFullTEm();
                    break;
                case 4:
                    m.showPartTEm();
                    break;
                case 5:
                    m.showAll();
                    break;
                case 6:
                    m.searchEmById();
                    break;
                case 7:
                    m.deleteEmById();
                    break;
                case 8:
                    m.editEmById();
                    break;
                case 9:
                    m.searchEmByPay();
                    break;
                case 10:
                    m.sortByAgeAPayment();
                    break;
                case 11:
                    break;
            }
        } while (menu != 11);
    }

    public void sortFullTEm() {
        Comparator<FullTimeEmployee> com1 = new Comparator<FullTimeEmployee>() {
            public int compare(FullTimeEmployee e1, FullTimeEmployee e2) {
                if (e2.getYearOfBirth() < e1.getYearOfBirth()) {
                    return 1;
                } else if ((e2.getYearOfBirth()) == (e1.getYearOfBirth())) {
                    if (e2.getPayment() < e1.getPayment()) {
                        return 1;
                    }
                    if (e2.getPayment() == e1.getPayment()) {
                        return 0;
                    }

                    return -1;
                }
                return -1;
            }
        };
        Fem.sort(com1);
    }

    public void sortPartTEm() {
        Comparator<PartTimeEmployee> com2 = new Comparator<PartTimeEmployee>() {
            public int compare(PartTimeEmployee e1, PartTimeEmployee e2) {
                if (e2.getYearOfBirth() < e1.getYearOfBirth()) {
                    return 1;
                } else if ((e2.getYearOfBirth()) == (e1.getYearOfBirth())) {
                    if (e2.getPayment() < e1.getPayment()) {
                        return 1;
                    }
                    if (e2.getPayment() == e1.getPayment()) {
                        return 0;
                    }

                    return -1;
                }
                return -1;
            }
        };
        Pem.sort(com2);
    }
}
