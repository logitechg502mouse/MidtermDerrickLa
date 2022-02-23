/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;
import java.util.Scanner;
/**
 * MidTerm Exam
 * @author srinivsi
 * @modifier Derrick La jdk17 feb23
 */
public class StausUser {
public enum STATUS{REJECTED, PENDING, PROCESSING, APPROVED, NOT_VALID_CODE};

private STATUS status;

    StausUser(){
        this.status = getStatus();
    }
    /**
     * @return the status
     */
    public STATUS getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(STATUS status) {
        this.status = status;
    }
    
public void statusDetail(){
    Scanner in =new Scanner(System.in);
    System.out.println("Enter the user status code (zero,one,two,three) in string");
    String code = in.next();
    switch(code.toUpperCase())
        {
        case "ZERO": System.out.println(STATUS.REJECTED);
        break;
        case "ONE": System.out.println(STATUS.PENDING);
        break;
        case "TWO":
        System.out.println(STATUS.PROCESSING);
        break;
        case "THREE": 
            System.out.println(STATUS.APPROVED);
        break;
        default:
         System.out.println(STATUS.NOT_VALID_CODE);
        break;
        }
    }
 
}
