package br.com.buscape.yellowSubmarine;

import br.com.buscape.yellowSubmarine.controller.Control;
import br.com.buscape.yellowSubmarine.exceptions.SubmarineAboveSeaLevelException;

import java.util.Scanner;


/**
 * @author wagner on 17/09/17
 */
class Main {

    public static void main(String[] args) throws SubmarineAboveSeaLevelException {
        Scanner scanner = new Scanner(System.in, "UTF-8"); //LMRDDMMUU
        System.out.print("Lets move the Yellow Submarine, tell me the coordinate: ");
        String command = scanner.next();

        Control control = new Control();
        System.out.println(control.applyRule(command));
    }

}
