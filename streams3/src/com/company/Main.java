package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("CSGO-Weapons-Data.csv"))) {

            ArrayList<Weapon> weapons = new ArrayList<>();

            br.readLine();
            String line;
            while (true) {
                line = br.readLine();
                if (line == null) break;

                String[] split = line.split(",");

                weapons.add(new Weapon(
                        split[0],
                        split[1],
                        Integer.parseInt(split[2].substring(1)),
                        Integer.parseInt(split[3].substring(1)),
                        Double.parseDouble(split[4]),
                        Integer.parseInt(split[5]),
                        Integer.parseInt(split[6]),
                        Integer.parseInt(split[7]),
                        Integer.parseInt(split[8]),
                        Double.parseDouble(split[9].substring(0, 5)),
                        Integer.parseInt(split[10]),
                        Integer.parseInt(split[11]),
                        Integer.parseInt(split[12]),
                        Integer.parseInt(split[13]),
                        Double.parseDouble(split[14]),
                        Double.parseDouble(split[15]),
                        Double.parseDouble(split[16]),
                        Integer.parseInt(split[17]),
                        Integer.parseInt(split[18]),
                        Double.parseDouble(split[19]),
                        Double.parseDouble(split[20]),
                        Double.parseDouble(split[21]),
                        Double.parseDouble(split[22])
                ));
            }

            System.out.println(weapons.stream()
                    .map(Weapon::getCost)
                    .mapToInt(integer -> integer)
                    .average());

            var slowT = weapons.stream()
                    .filter(weapon -> weapon.getTeam().equals("T"))
                    .filter(weapon -> weapon.getRate() < 200)
                    .map(Weapon::getName)
                    .toArray();
            for (Object o : slowT) {
                System.out.print(o + " ");
            }
            System.out.println();

            var highDamage = weapons.stream()
                    .sorted(Comparator.comparingInt(Weapon::getDamage).reversed())
                    .limit(4)
                    .map(Weapon::getName)
                    .toArray();

            for (Object o : highDamage) {
                System.out.print(o + " ");
            }
            System.out.println();


        } catch (IOException e) {
            System.out.println("Not found");
        }
    }
}




























