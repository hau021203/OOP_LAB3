package com.mycompany.cdstore;

import java.util.*;

public class CDStore {

    private ArrayList<MenuEdit> CDs = new ArrayList<MenuEdit>();

    public static void main(String[] args) {
        CDStore CD = new CDStore();
        CD.menu();
    }

    public CDStore() {

    }

    public void Input() {
        MenuEdit a = new MenuEdit();
        a.InputCD();
        CDs.add(a);
    }

    public void Output() {
        for (int i = 0; i < CDs.size(); i++) {
            CDs.get(i).OutputCD();
        }
    }

    public void SearchByTi() {
        System.out.println("Enter CD title :");
        Scanner sc = new Scanner(System.in);
        String b;
        b = sc.next();
        for (int i = 0; i < CDs.size(); i++) {
            if (CDs.get(i).getTitle().equals(b)) {
                CDs.get(i).OutputCD();
                break;
            }
        }
    }

    public void SearchByCol() {
        System.out.println("Enter CD collection(game/movie/music) :");
        Scanner sc = new Scanner(System.in);
        String b;
        b = sc.next();
        for (int i = 0; i < CDs.size(); i++) {
            if (CDs.get(i).getCDCollection().equals(b)) {
                CDs.get(i).OutputCD();
            }
        }
    }

    public void SearchByTyp() {
        System.out.println("Enter CD Type (audio/video) :");
        Scanner sc = new Scanner(System.in);
        String b;
        b = sc.next();
        for (int i = 0; i < CDs.size(); i++) {
            if (CDs.get(i).getCDType().equals(b)) {
                CDs.get(i).OutputCD();
            }
        }
    }

    public void DeleteByID() {
        System.out.println("Enter CD id :");
        Scanner sc = new Scanner(System.in);
        String b;
        b = sc.next();
        for (int i = 0; i < CDs.size(); i++) {
            if (CDs.get(i).getCDId().equals(b)) {
                CDs.remove(i);
                break;
            }
        }
    }

    public void EditByID() {
        System.out.println("Enter CD id :");
        Scanner sc = new Scanner(System.in);
        String b;
        b = sc.next();
        for (int i = 0; i < CDs.size(); i++) {
            if (CDs.get(i).getCDId().equals(b)) {
                System.out.println("Enter CD collection (game/movie/music) :");
                CDs.get(i).setCDCollection(sc.next());
                System.out.println("Enter CD type (audio/video) :");
                CDs.get(i).setCDType(sc.next());
                System.out.println("Enter CD title :");
                CDs.get(i).setTitle(sc.nextLine());
                System.out.println("Enter CD price :");
                CDs.get(i).setPrice(sc.nextInt());
                System.out.println("Enter the year CD release :");
                CDs.get(i).setYearOfRe(sc.nextInt());
                break;
            }
        }
    }

    public void menu() {
        int menu;
        CDStore a = new CDStore();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.printf("1. Add CD \n"
                    + "2. Search CD by CD title\n"
                    + "3. Search CDs by collection (game/movie/music)\n"
                    + "4. Search CDs by type (audio/video)\n"
                    + "5. Delete CD by CD Id\n"
                    + "6. Edit CD information by Id\n"
                    + "7. Display all CDs\n"
                    + "8. Sort the CD list ascending by year of release\n"
                    + "9. Exit\nInput: ");

            menu = sc.nextInt();
            String b;
            switch (menu) {
                case 1:
                    a.Input();
                    break;
                case 2:                    
                    a.SearchByTi();
                    break;
                case 3:
                    a.SearchByCol();
                    break;
                case 4:
                    a.SearchByTyp();
                    break;
                case 5:
                    a.DeleteByID();
                    break;
                case 6:
                    a.EditByID();
                    break;
                case 7:
                    a.Output();
                    break;
                case 8:
                    a.sort();
                    break;
                case 9:
                    break;
            }
        } while (menu != 9);

    }

    public void sort() {
        Comparator<MenuEdit> com = new Comparator<MenuEdit>() {
            public int compare(MenuEdit e1, MenuEdit e2) {
                if (e2.getYearOfRe() - e1.getYearOfRe() < 0) {
                    return 1;
                } else if ((e2.getYearOfRe()) - (e1.getYearOfRe()) == 0) {
                    return 0;
                }
                return -1;
            }
        };
        CDs.sort(com);
    }
}
