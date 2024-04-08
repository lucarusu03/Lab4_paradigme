import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Student {
    private String nume;
    private String grupa;
    private List<Integer> note;

    public Student(String nume, String grupa){
        this.nume = nume;
        this.grupa = grupa;
        note = new ArrayList();
    }

    public String getNume() {
        return nume;
    }

    public String getGrupa() {
        return grupa;
    }


    public void adaugaNota(int nota){
        note.add(nota);
    }

    public void afisareNote(){
        for(int i : note){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public boolean esteIntegralist(){
        for(int i : note){
            if(i<5){
                return false;
            }
        }
        return true;
    }

    public Double medie(){
        double medie=0;
        for(int i : note){
            medie+=i;
        }
        return medie/5;
    }



    public void afisarePeGrupe(){

    }
}
