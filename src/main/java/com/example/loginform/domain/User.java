package com.example.loginform.domain;

import javax.persistence.*;

@Entity
@Table(name="login")
public class User implements Validar{

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    public Privilegio privilegio;

    public User() {

    }

    public User(String username, String password, Privilegio privilegio) {
        this.username = username;
        this.password = password;
        this.privilegio = privilegio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Privilegio getPrivilegio() {
        return privilegio;
    }

    public void setPrivilegio(Privilegio privilegio) {
        this.privilegio = privilegio;
    }

    public String valida_login(User user) {

        if(user.username=="admin" && user.password=="123") {          //1   //2
            switch (user.privilegio){                                 //3
                case comum:                                           //4
                    return "Usuario Comum";
                case coordenador:                                     //5
                    return "Usuario Coordenador";
                case administrador:                                   //6
                    return "Usuario Admin";
                case estagiario:                                      //7
                    return "Usuario Estagiario";
                case gerente:                                         //8
                    return "Usuario Gerente";
                case desenvolvedor_1:                                 //9
                    return "Usuario Desenvolvedor Junior";
                case desenvolvedor_2:                                 //10
                    return "Usuario Desenvolvedor Pleno";
                case desenvolvedor_3:                                 //11
                    return "Usuario Desenvolvedor Senior";
                case master:                                          //12
                    return "Usuario Master";
                default:                                              //13
                    return "Usuario sem permissões";
                
            }
        } else {
            return "Usuario ou senha incorretos";                   //14
        }
    }                                                               //15

    
}
