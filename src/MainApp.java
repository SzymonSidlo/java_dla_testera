import computer.*;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainApp {
    public static void main(String[] args) {

        List<Computer> computers = new ArrayList<>();
        computers.add(new Laptop("Mb Pro1", "Pro 1", new Hdd("Hp", 500), new Ram("Hp", 128), 100));
        computers.add(new Laptop("Mb Pro2", "Pro 2", new Hdd("Hp", 500), new Ram("Hp", 128), 100));
        computers.add(new Laptop("Mb Pro3", "Pro 3", new Hdd("Hp", 256), new Ram("Hp", 128), 100));
        computers.add(new Laptop("Mb Pro4", "Pro 4", new Hdd("Hp", 500), new Ram("Hp", 128), 100));
        computers.add(new PC("PC1", "BBB", new Hdd("HP", 500), new Ram("Hp", 128)));
        computers.add(new PC("PC1", "AAA", new Hdd("HP", 256), new Ram("Hp", 256)));
        computers.add(new PC("PC3", "Pro 3", new Hdd("HP", 500), new Ram("Hp", 128)));

        // 1. Zliczyć wszystkie komputery, które mają więcej niż 128 Gb Ramu //

        long countRamSize = computers.stream()
                .filter(computer -> computer.getRam().getSize() > 128)
                .count();
        System.out.println(countRamSize);

        // 2. Wyświetlić wszystkie typy komputerów (użyć „map”), zwrócić tylko typ

        computers.stream()
                .map(Computer::getType)
                .forEach(System.out::println);

        // 3. Wyświetlić komputer, który ma najwięcej ramu //
        // 3a. "w pudełku optional" //

        Optional<Computer> maxCompareRam = computers.stream()
                .max(Comparator.comparingInt(comp -> comp.getRam().getSize()));
        System.out.println(maxCompareRam);
        //3b. Komputer "wyciągnięty z pudełka"//
        if (maxCompareRam.isPresent()) {
            System.out.println(maxCompareRam.get());
        } else {
            System.out.println("Element nieobecny");
        }

        // 4. Utworzyć nową kolekcję z komputerami, które mają dysk twardy mniejszy niż 500 gb //

        List<Computer> collectionSmallHdd = computers.stream()
                .filter(computer -> computer.getHdd().getSize() < 500)
                .collect(Collectors.toList());

        System.out.println(collectionSmallHdd);

        // 5. Posortować komputery po nazwie (najpierw) i typie (później) //

        List<Computer> collectNameAndType = computers.stream()
                .sorted(Comparator.comparing(Computer::getName).thenComparing(Computer::getType))
                .collect(Collectors.toList());

        for (Computer collectionNaT : collectNameAndType) {
            System.out.println(collectionNaT.getName() + "  " + collectionNaT.getType() + "  " + collectionNaT.getType() +
                    "  " + collectionNaT.getHdd().getBrand() + "  " + collectionNaT.getHdd().getSize() + "  " +
                    collectionNaT.getRam().getBrand() + "  " + collectionNaT.getRam().getSize());
        }

        // 6. Przećwiczyć Optional //
        // "get" oraz "isPresent" przećwiczone w punkcie 3b j.w.//

        //isEmpty  //
        Optional<Computer> minHdd = computers.stream()
                .min(Comparator.comparingInt(comp -> comp.getHdd().getSize()));

        if (minHdd.isEmpty()) {
            System.out.println("Nie znaleziono elementu");
        } else {
            System.out.println(minHdd.get());
        }

        //orElse//

        String pC1 = computers.stream()
                .map(Computer::getName)
                .filter(comp -> comp.equals("PC1"))
                .findFirst()
                .orElse("PC1 nie istnieje na liście");

        System.out.println(pC1);

        //orElseGet//

        Computer computerAlt = computers.stream()
                .filter(computer -> computer.getName().startsWith("P"))
                .findFirst()
                .orElseGet(() -> new PC("PC_Kwantowy", "Total-PRO", new Hdd("From_China", 850000),
                        new Ram("Ram_Of_The_Dragon", 98500000)));

        System.out.println(computerAlt);

        //orElseThrow//

        Computer computerThrow = computers.stream()
                .filter(computer -> computer.getName().startsWith("P"))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Nie ma komputera o takiej nazwie"));

        System.out.println(computerThrow);

        //ifPresent//
        computers.stream()
                .filter(computer -> computer.getName().startsWith("P"))
                .findFirst()
                .ifPresent(System.out::println);

        //ifPresentOrElse//
        computers.stream()
                .filter(computer -> computer.getName().startsWith("P"))
                .findFirst()
                .ifPresentOrElse(System.out::println, () -> System.out.println("Nie ma takiego komputera"));


    }
}


