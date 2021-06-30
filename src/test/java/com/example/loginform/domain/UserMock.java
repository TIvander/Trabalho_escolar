package com.example.loginform.domain;

import org.aspectj.lang.annotation.Before;
import org.easymock.EasyMock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.easymock.EasyMock.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.internal.util.MockUtil.createMock;

public class UserMock {

    @Test
    void valida_login_mock1() {
        Validar userMock = EasyMock.createMock(Validar.class);
        User user = new User("abc", "123", Privilegio.comum);
        expect(userMock.valida_login(user)).andReturn("Usuario ou senha incorretos");
        replay(userMock);
        User users = new User("abc", "123", Privilegio.comum);
        assertEquals("Usuario ou senha incorretos", user.valida_login(users));
    }

    @Test
    void valida_login_mock2() {
        Validar userMock = EasyMock.createMock(Validar.class);
        User usermock = new User("admin", "321", Privilegio.comum);
        expect(userMock.valida_login(usermock)).andReturn("Usuario ou senha incorretos");
        replay(userMock);
        User users = new User("admin", "321", Privilegio.comum);
        assertEquals("Usuario ou senha incorretos", usermock.valida_login(users));
    }

    @Test
    void valida_login_mock3() {
        Validar userMock = EasyMock.createMock(Validar.class);
        User usermock = new User("admin", "123", Privilegio.comum);
        expect(userMock.valida_login(usermock)).andReturn("Usuario Comum");
        replay(userMock);
        User users = new User("admin", "123", Privilegio.comum);
        assertEquals("Usuario Comum", usermock.valida_login(users));
    }

    @Test
    void valida_login_mock4() {
        Validar userMock = EasyMock.createMock(Validar.class);
        User usermock = new User("admin", "123", Privilegio.coordenador);
        expect(userMock.valida_login(usermock)).andReturn("Usuario Coordenador");
        replay(userMock);
        User users = new User("admin", "123", Privilegio.coordenador);
        assertEquals("Usuario Coordenador", usermock.valida_login(users));
    }

    @Test
    void valida_login_mock5() {
        Validar userMock = EasyMock.createMock(Validar.class);
        User usermock = new User("admin", "123", Privilegio.administrador);
        expect(userMock.valida_login(usermock)).andReturn("Usuario Admin");
        replay(userMock);
        User users = new User("admin", "123", Privilegio.administrador);
        assertEquals("Usuario Admin", usermock.valida_login(users));
    }

    @Test
    void valida_login_mock6() {
        Validar userMock = EasyMock.createMock(Validar.class);
        User usermock = new User("admin", "123", Privilegio.bloqueado);
        expect(userMock.valida_login(usermock)).andReturn("Usuario sem permissões");
        replay(userMock);
        User users = new User("admin", "123", Privilegio.bloqueado);
        assertEquals("Usuario sem permissões", usermock.valida_login(users));
    }

    @Test
    void valida_login_mock7() {
        Validar userMock = EasyMock.createMock(Validar.class);
        User usermock = new User("admin", "123", Privilegio.estagiario);
        expect(userMock.valida_login(usermock)).andReturn("Usuario Estagiario");
        replay(userMock);
        User users = new User("admin", "123", Privilegio.estagiario);
        assertEquals("Usuario Estagiario", usermock.valida_login(users));
    }

    @Test
    void valida_login_mock8() {
        Validar userMock = EasyMock.createMock(Validar.class);
        User usermock = new User("admin", "123", Privilegio.gerente);
        expect(userMock.valida_login(usermock)).andReturn("Usuario Gerente");
        replay(userMock);
        User users = new User("admin", "123", Privilegio.gerente);
        assertEquals("Usuario Gerente", usermock.valida_login(users));
    }

    @Test
    void valida_login_mock9() {
        Validar userMock = EasyMock.createMock(Validar.class);
        User usermock = new User("admin", "123", Privilegio.desenvolvedor_1);
        expect(userMock.valida_login(usermock)).andReturn("Usuario Desenvolvedor Junior");
        replay(userMock);
        User users = new User("admin", "123", Privilegio.desenvolvedor_1);
        assertEquals("Usuario Desenvolvedor Junior", usermock.valida_login(users));
    }

    @Test
    void valida_login_mock10() {
        Validar userMock = EasyMock.createMock(Validar.class);
        User usermock = new User("admin", "123", Privilegio.desenvolvedor_2);
        expect(userMock.valida_login(usermock)).andReturn("Usuario Desenvolvedor Pleno");
        replay(userMock);
        User users = new User("admin", "123", Privilegio.desenvolvedor_2);
        assertEquals("Usuario Desenvolvedor Pleno", usermock.valida_login(users));
    }

    @Test
    void valida_login_mock11() {
        Validar userMock = EasyMock.createMock(Validar.class);
        User usermock= new User("admin", "123", Privilegio.desenvolvedor_3);
        expect(userMock.valida_login(usermock)).andReturn("Usuario Desenvolvedor Senior");
        replay(userMock);
        User users = new User("admin", "123", Privilegio.desenvolvedor_3);
        assertEquals("Usuario Desenvolvedor Senior", usermock.valida_login(users));
    }

    @Test
    void valida_login_mock12() {
        Validar userMock = EasyMock.createMock(Validar.class);
        User usermock = new User("admin", "123", Privilegio.master);
        expect(userMock.valida_login(usermock)).andReturn("Usuario Master");
        replay(userMock);
        User users = new User("admin", "123", Privilegio.master);
        assertEquals("Usuario Master", usermock.valida_login(users));
    }
}
