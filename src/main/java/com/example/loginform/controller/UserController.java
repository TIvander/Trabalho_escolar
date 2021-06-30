package com.example.loginform.controller;

import com.example.loginform.domain.Privilegio;
import com.example.loginform.domain.User;
import com.example.loginform.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Objects;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public ModelAndView login() {
        ModelAndView mav = new ModelAndView("login");
        mav.addObject("user", new User());
        return mav;
    }
    @GetMapping("/erro")
    public ModelAndView erro() {
        ModelAndView erro = new ModelAndView("erro");
        erro.addObject("user", new User());
        return erro;
    }

    @GetMapping("/comum")
    public ModelAndView comum() {
        ModelAndView comum = new ModelAndView("comum");
        comum.addObject("user", new User());
        return comum;
    }

    @GetMapping("/coordenador")
    public ModelAndView coordenador() {
        ModelAndView coordenador = new ModelAndView("coordenador");
        coordenador.addObject("user", new User());
        return coordenador;
    }

    @GetMapping("/administrador")
    public ModelAndView administrador() {
        ModelAndView administrador = new ModelAndView("administrador");
        administrador.addObject("user", new User());
        return administrador;
    }

    @GetMapping("/estagiario")
    public ModelAndView estagiario() {
        ModelAndView estagiario = new ModelAndView("estagiario");
        estagiario.addObject("user", new User());
        return estagiario;
    }

    @GetMapping("/gerente")
    public ModelAndView gerente() {
        ModelAndView gerente = new ModelAndView("gerente");
        gerente.addObject("user", new User());
        return gerente;
    }

    @GetMapping("/desenvolvedor_1")
    public ModelAndView desenvolvedor_1() {
        ModelAndView desenvolvedor_1 = new ModelAndView("desenvolvedor_1");
        desenvolvedor_1.addObject("user", new User());
        return desenvolvedor_1;
    }

    @GetMapping("/desenvolvedor_2")
    public ModelAndView desenvolvedor_2() {
        ModelAndView desenvolvedor_2 = new ModelAndView("desenvolvedor_2");
        desenvolvedor_2.addObject("user", new User());
        return desenvolvedor_2;
    }

    @GetMapping("/desenvolvedor_3")
    public ModelAndView desenvolvedor_3() {
        ModelAndView desenvolvedor_3 = new ModelAndView("desenvolvedor_3");
        desenvolvedor_3.addObject("user", new User());
        return desenvolvedor_3;
    }

    @GetMapping("/master")
    public ModelAndView master() {
        ModelAndView master = new ModelAndView("master");
        master.addObject("user", new User());
        return master;
    }


    @GetMapping("/bloqueado")
    public ModelAndView bloqueado() {
        ModelAndView bloqueado = new ModelAndView("bloqueado");
        bloqueado.addObject("user", new User());
        return bloqueado;
    }

    @PostMapping("/login")
    public String logon(@ModelAttribute("user") User user) {
        User oauthUser = userService.login(user.getUsername(), user.getPassword());
        System.out.print(oauthUser);
        if(Objects.nonNull(oauthUser)) {
            switch (oauthUser.privilegio) {
                case comum:
                    return "redirect:/comum";
                case coordenador:
                    return "redirect:/coordenador";
                case administrador:
                    return "redirect:/administrador";
                case estagiario:
                    return "redirect:/estagiario";
                case gerente:
                    return "redirect:/gerente";
                case desenvolvedor_1:
                    return "redirect:/desenvolvedor_1";
                case desenvolvedor_2:
                    return "redirect:/desenvolvedor_2";
                case desenvolvedor_3:
                    return "redirect:/desenvolvedor_3";
                case master:
                    return "redirect:/master";
                default:
                    return "redirect:/bloqueado";

            }
        } else {
            return "redirect:/erro";
        }

    }



}
