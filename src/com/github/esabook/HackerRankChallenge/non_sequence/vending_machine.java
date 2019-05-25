package com.github.esabook.HackerRankChallenge.non_sequence;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class vending_machine {
    /*
     * Complete the function below.
     */
    static String validateMoneyInput(String rawMoney) {
        // Write your code here.
        // fast write
        Map<Integer,String> drink = new HashMap<>();
        drink.put(2000,"Aqua");
        drink.put(5000, "Sosro");
        drink.put(7000, "Coca-cola");
        drink.put(9000, "Milo");
        String ret;
        if (drink.containsKey(rawMoney)){
            ret = "Pecahan tidak diterima !!";
        }else{
            ret = drink.get(rawMoney);
        }
        return ret;
        // END Write your code here.
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String selectedDrink = null;

        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        if (bw == null) {
            bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        String inputVal = null;
        while (scan.hasNext()) {
            if (null != inputVal) {
                inputVal += scan.nextLine().trim() + " ";
            } else {
                inputVal = scan.nextLine().trim() + " ";
            }
        }
        selectedDrink = validateMoneyInput(inputVal);


        bw.write(selectedDrink);
        bw.newLine();

        bw.close();
    }
}
