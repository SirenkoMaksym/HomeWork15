/*
 * created by max$
 */


package lesson028.test;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MemberTest {

    Member member;
    String startEmail = "john@test.com";
    String startPassword = "qwerty1Q$";

    @BeforeEach
    void setUp(){
        member = new Member(startEmail, startPassword);
    }
    @Test
    void testValidEmailSet(){
        String validEmail = "valid@test.com";
        System.out.println("getMail after: " + member.getMail());

        member.setMail(validEmail);

        System.out.println("getMail before: " + member.getMail());
        Assertions.assertEquals(validEmail, member.getMail());
    }

    @ParameterizedTest
    @MethodSource("invalidEmailData")
    public void testSetInvalidEmail(String invalidEmail){
        member.setMail(invalidEmail);
        Assertions.assertEquals(startEmail,member.getMail() );

    }
    static Stream<String> invalidEmailData(){
        return Stream.of("tes%.t@ema@il.com",
                "test@ema@ilcom",
                "test@em.a@il.co.m",
                "test@.ema@il,com",
                "test@ema@ilco.m",
                "tes@t.ema@il.co.m",
                "test@ema@il.co.m.",
                "@test.ema@il.com");
    }

    @Test
    void testValidPasswordSet(){
        String validPassword = "Gpassword2)";
        System.out.println("getPassword after: " + member.getPassword());

        member.setPassword(validPassword);

        System.out.println("getPassword before: " + member.getPassword());
        Assertions.assertEquals(validPassword, member.getPassword());
    }

    @ParameterizedTest
    @MethodSource("invalidPasswordData")
    public void testSetInvalidPassword(String invalidPassword){
        member.setPassword(invalidPassword);
        Assertions.assertEquals(startPassword, member.getPassword());
    }
    static Stream<String> invalidPasswordData(){
        return Stream.of("Gpassword2",
                "gpassword2)",
                "Gpassword)",
                "GPASSWORD2)",
                "Gpard2)"
               );
    }
}
