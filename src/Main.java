import java.util.HashSet;
import java.util.Iterator;
//Scrivere una funzione che restituisca un hashset riempito
//Creare un oggeto dello stesso tipo inserito nell'HashSet e popolarlo
//Scorrere il set, per ogni elemento verificare se è uguale all'oggetto creato ed eliminarlo
//Svuotare l'hashset, verificarlo e stampare il risultato

public class Main {
    public static void main(String[] args) {
        HashSet<String> hashSet = readHashSet();
        int setSize = hashSet.size();
        System.out.println("Dimensione del set: " + setSize + " elementi.");
        System.out.println("Elementi nel set: ");
        for (String element : hashSet) {
            System.out.println(element);
        }

        // Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
        HashSet<String> newHashSet = new HashSet<>(hashSet);
        System.out.println("Nuovo HashSet creato: " + newHashSet);

        // Scorrere il set, per ogni elemento verificare se è uguale all'oggetto creato ed eliminarlo
        Iterator<String> iterator = hashSet.iterator();
        String elementToRemove = "3";
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.equals(elementToRemove)) {
                iterator.remove();
            }
        }
        System.out.println("HashSet dopo la rimozione di '" + elementToRemove + "': " + hashSet);

        // Svuotare l'HashSet, verificarlo e stampare il risultato
        hashSet.clear();
        System.out.println("HashSet svuotato: " + hashSet);
        System.out.println("Il set è vuoto? " + hashSet.isEmpty());
    }

    // Scrivere una funzione che restituisca un HashSet riempito
    private static HashSet<String> readHashSet() {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("1");
        hashSet.add("2");
        hashSet.add("3");
        hashSet.add("4");
        hashSet.add("5");
        hashSet.add("6");
        hashSet.add("7");

        return hashSet;
    }
}