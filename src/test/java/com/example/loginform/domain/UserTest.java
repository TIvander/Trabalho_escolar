package com.example.loginform.domain;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;

public class UserTest {

    @Test
    void valida_login_test1() {
        User user = new User("abc", "123", Privilegio.comum);
        assertEquals("Usuario ou senha incorretos", user.valida_login(user));
    }

    @Test
    void valida_login_test2() {
        User user = new User("admin", "321", Privilegio.comum);
        assertEquals("Usuario ou senha incorretos", user.valida_login(user));
    }

    @Test
    void valida_login_test3() {
        User user = new User("admin", "123", Privilegio.comum);
        assertEquals("Usuario Comum", user.valida_login(user));
    }

    @Test
    void valida_login_test4() {
        User user = new User("admin", "123", Privilegio.coordenador);
        assertEquals("Usuario Coordenador", user.valida_login(user));
    }

    @Test
    void valida_login_test5() {
        User user = new User("admin", "123", Privilegio.administrador);
        assertEquals("Usuario Admin", user.valida_login(user));
    }

    @Test
    void valida_login_test6() {
        User user = new User("admin", "123", Privilegio.bloqueado);
        assertEquals("Usuario sem permissões", user.valida_login(user));
    }

    @Test
    void valida_login_test7() {
        User user = new User("admin", "123", Privilegio.estagiario);
        assertEquals("Usuario Estagiario", user.valida_login(user));
    }

    @Test
    void valida_login_test8() {
        User user = new User("admin", "123", Privilegio.gerente);
        assertEquals("Usuario Gerente", user.valida_login(user));
    }

    @Test
    void valida_login_test9() {
        User user = new User("admin", "123", Privilegio.desenvolvedor_1);
        assertEquals("Usuario Desenvolvedor Junior", user.valida_login(user));
    }

    @Test
    void valida_login_test10() {
        User user = new User("admin", "123", Privilegio.desenvolvedor_2);
        assertEquals("Usuario Desenvolvedor Pleno", user.valida_login(user));
    }

    @Test
    void valida_login_test11() {
        User user = new User("admin", "123", Privilegio.desenvolvedor_3);
        assertEquals("Usuario Desenvolvedor Senior", user.valida_login(user));
    }

    @Test
    void valida_login_test12() {
        User user = new User("admin", "123", Privilegio.master);
        assertEquals("Usuario Master", user.valida_login(user));
    }

}
