package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        if (65 <= symbol && symbol <= 90 && 97 <= symbol && symbol <=122){
            System.out.println("English");
        }
        else{
            System.out.println("Nom English");
        }
    }
}
