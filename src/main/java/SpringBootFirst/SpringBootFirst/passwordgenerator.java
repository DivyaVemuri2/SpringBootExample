package SpringBootFirst.SpringBootFirst;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class passwordgenerator {

    public static void main(String[] args) {
//        PasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
//        System.out.println("divya  "+bCryptPasswordEncoder.encode("divya"));
//        System.out.println(bCryptPasswordEncoder.encode("swetha"));
//        System.out.println(bCryptPasswordEncoder.encode("sonika"));
//        System.out.println(bCryptPasswordEncoder.encode("admin"));

//        $2a$10$yRr.vw2QkkPLIvbUlxF7oO5X0EIm3FJqBp0EveEXtjTafdORX9zFm
//        divya  $2a$10$CG9NO8wqDXljcgWyzpyV0OZ8.4yepHyXxiT2OxL0lweQCJ32aQK/y
        org.springframework.security.crypto.password.PasswordEncoder encoder
                = new org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder();

        // $2a$10$lB6/PKg2/JC4XgdMDXyjs.dLC9jFNAuuNbFkL9udcXe/EBjxSyqxW
        // true
        // $2a$10$KbQiHKTa1WIsQFTQWQKCiujoTJJB7MCMSaSgG/imVkKRicMPwgN5i
        // true
        // $2a$10$5WfW4uxVb4SIdzcTJI9U7eU4ZwaocrvP.2CKkWJkBDKz1dmCh50J2
        // true
        // $2a$10$0wR/6uaPxU7kGyUIsx/JS.krbAA9429fwsuCyTlEFJG54HgdR10nK
        // true
        // $2a$10$gfmnyiTlf8MDmwG7oqKJG.W8rrag8jt6dNW.31ukgr0.quwGujUuO
        // true

        for (int i = 0; i < 5; i++) {
            // "123456" - plain text - user input from user interface
            String passwd = encoder.encode("123456");

            // passwd - password from database
            System.out.println(passwd); // print hash

            // true for all 5 iteration
            System.out.println(encoder.matches("123456", passwd));
        }

    }
}
