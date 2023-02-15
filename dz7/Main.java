import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        GetTask();
    }
    private static void GetTask(){
        family m1 = new family("Иванов", "Иван", "M");
        family m2 = new family("Иванова", "Мария", "F");
        family m3 = new family("Иванова", "Ксения", "F");

        family m4 = new family("Петров", "Игорь", "M");
        family m5 = new family("Петрова", "Марина", "F");
        
        family m6 = new family("Иванова", "Жанна", "F");
        family m7= new family("Иванов", "Гурген", "M");
        

        m1.setMother(m6);
        m1.setChild(m3);
        m1.setFather(m7);
        m1.setSp(m2);

        m2.setMother(m5);
        m2.setFather(m4);
        m2.setChild(m3);
        m2.setSp(m1);


        m2.setMother(m5);
        m2.setGranfather(m4);
        m2.setGranfather(m7);
        m2.setGranmother(m3);
        m2.setGranmother(m6);
        m3.setFather(m1);

        m4.setChild(m2);
        m4.setSp(m5);
        m5.setChild(m2);
        m5.setSp(m4);

        m6.setChild(m1);
        m6.setSp(m7);
        m7.setChild(m1);
        m7.setSp(m6);


        while (true){
            System.out.println("Введите имя человека для просмотра его потомков.");
            System.out.println("0 - для выхода из программы");
            String name = sc.nextLine();
            if (name.equals("0")){
                System.out.println("Программа завершена");
                break;
            }else{
                for (var family : family.familySet) {
                    if (family.getName().equals(name)){
                        if (family.getChild() != null){
                            System.out.println("У  "+family.getName()+" "+family.getSurname()+ " есть дети :\n" +family.getChild().getInfo());
                        }else {
                            System.out.println("У "+family.getName()+" "+family.getSurname()+ " детей нет.");
                        }
                
                    if (family.getMother() != null){
                        System.out.println("У "+family.getName()+" "+family.getSurname()+ " есть мать :\n" +family.getMother().getInfo());
                    }else {
                        System.out.println("У "+family.getName()+" "+family.getSurname()+ " нет матери.");
                        }
                    
                    if (family.getFather() != null){
                        System.out.println("У "+family.getName()+" "+family.getSurname()+ " есть отец :\n" +family.getFather().getInfo());
                    }else {
                         System.out.println("У "+family.getName()+" "+family.getSurname()+ " нет отца.");
                         }

                    if (family.getBrother() != null){
                         System.out.println("У "+family.getName()+" "+family.getSurname()+ " есть брат :\n" +family.getBrother().getInfo());
                    }else {
                        System.out.println("У "+family.getName()+" "+family.getSurname()+ " нет брата.");
                            }

                    
                    if (family.getSister() != null){
                         System.out.println("У "+family.getName()+" "+family.getSurname()+ " есть сестра :\n" +family.getSister().getInfo());
                    }else {
                         System.out.println("У "+family.getName()+" "+family.getSurname()+ " нет сестры.");
                             }

                    if (family.getGranfather() != null){
                        System.out.println("У "+family.getName()+" "+family.getSurname()+ " есть дедушка :\n" +family.getGranfather().getInfo());
                    }else {
                        System.out.println("У "+family.getName()+" "+family.getSurname()+ " нет дедушка.");
                             }

                    if (family.getUncle() != null){
                        System.out.println("У "+family.getName()+" "+family.getSurname()+ " есть дядя :\n" +family.getUncle().getInfo());
                    }else {
                        System.out.println("У "+family.getName()+" "+family.getSurname()+ " нет дяди.");
                             }

                    if (family.getGranmother() != null){
                         System.out.println("У "+family.getName()+" "+family.getSurname()+ " есть бабушка :\n" +family.getGranmother().getInfo());
                    }else {
                         System.out.println("У "+family.getName()+" "+family.getSurname()+ " нет бабушки.");
                            }

                    if (family.getAunt() != null){
                         System.out.println("У "+family.getName()+" "+family.getSurname()+ " есть тетя :\n" +family.getAunt().getInfo());
                    }else {
                        System.out.println("У "+family.getName()+" "+family.getSurname()+ " нет тети.");
                             }

                    if (family.getNephew() != null){
                        System.out.println("У "+family.getName()+" "+family.getSurname()+ " есть племянник :\n" +family.getNephew().getInfo());
                    }else {
                        System.out.println("У "+family.getName()+" "+family.getSurname()+ " нет племянника.");
                             }

                    if (family.getNiece() != null){
                        System.out.println("У "+family.getName()+" "+family.getSurname()+ " есть племянница :\n" +family.getNiece().getInfo());
                    }else {
                        System.out.println("У "+family.getName()+" "+family.getSurname()+ " нет племянниц.");
                            }

                    if (family.getSp() != null){
                        System.out.println("У "+family.getName()+" "+family.getSurname()+ " состоит в браке с  :\n" +family.getSp().getInfo());
                    }else {
                        System.out.println("У "+family.getName()+" "+family.getSurname()+ " не состоит в браке.");
                                    }

                    break;

                    }
                }
            }
        }
    }
}