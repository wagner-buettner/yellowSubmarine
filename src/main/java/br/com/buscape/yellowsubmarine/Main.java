package br.com.buscape.yellowsubmarine;

import br.com.buscape.yellowsubmarine.controller.Control;
import br.com.buscape.yellowsubmarine.exceptions.SubmarineAboveSeaLevelException;

import java.util.Scanner;


/**
 * @author wagner on 17/09/17
 */
final class Main {

    private Main (){}

    public static void main(String[] args) throws SubmarineAboveSeaLevelException {
        Scanner scanner = new Scanner(System.in, "UTF-8"); //LMRDDMMUU
        System.out.print("Lets move the Yellow Submarine, tell me the coordinate: "); //NOPMD
        String command = scanner.next();

        Control control = new Control();
        System.out.println(control.applyRule(command)); //NOPMD
    }

}
