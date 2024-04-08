import java.util.*;

public class Main {
    public static void main(String[] args) {
        int i,k;
        List<Integer> x = new ArrayList();
        List<Integer> y = new ArrayList();
        List<Integer> xPlusY = new ArrayList(); //a
        Set<Integer> zSet = new TreeSet(); //b
        List<Integer> xMinusY = new ArrayList();//c
        int p = 4;
        List<Integer> xPlusYLimitedByP = new ArrayList(); //d

        java.util.Random rand = new java.util.Random();

        for(i=0;i<5;i++){
            k=rand.nextInt(11);
            x.add(k);
            xPlusY.add(k);
        }
        for(i=0;i<7;i++){
            k=rand.nextInt(11);
            y.add(k);
            xPlusY.add(k);
        }
        Collections.sort(xPlusY);

        System.out.print("x: ");
        for(int j : x){
            System.out.print(j + " ");
            if(!zSet.contains(j) & y.contains(j)){
                zSet.add(j);
            }
            if(!y.contains(j)){
                xMinusY.add(j);
            }
        }
        System.out.println();
        System.out.print("y: ");
        for(int j : y){
            System.out.print(j + " ");

        }
        System.out.println();
        System.out.print("xPlusY: ");
        for(int j : xPlusY){
            System.out.print(j + " ");
            if(j<=p){
                xPlusYLimitedByP.add(j);
            }
        }
        System.out.println();
        System.out.print("zSet: ");
        for(int j : zSet){
            System.out.print(j + " ");

        }
        System.out.println();
        Collections.sort(xMinusY);
        System.out.print("xMinusY: ");
        for(int j : xMinusY){
            System.out.print(j + " ");

        }
        System.out.println();

        System.out.print("xPlusYLimitedByP: ");
        for(int j : xPlusYLimitedByP){
            System.out.print(j + " ");

        }
        System.out.println();


        List<Student> studenti=new ArrayList<>();
        Student s1=new Student("Rusu-Luca","222_2");
        Student s2=new Student("Dinca-Ciprian","222_1");

        for(int j=0;j<5;j++){
            s1.adaugaNota(rand.nextInt(7)+4);
            s2.adaugaNota(rand.nextInt(7)+4);
        }

        studenti.add(s1);
        studenti.add(s2);
        s1.afisareNote();
        System.out.println(s1.medie());
        s2.afisareNote();
        System.out.println(s2.medie());




    }
}
