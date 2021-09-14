package net.software.backendcursojava.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import net.software.backendcursojava.models.request.userDetailRequestModel;
import net.software.backendcursojava.models.responses.UserRest;

@RestController
@RequestMapping("/users") // localhost/users
public class UserController {

    @GetMapping // obtener usuarios
    public String getUser() {

        return "Obterner usuarios";
    }

    @PostMapping // crear usuario
    public UserRest createUser(@RequestBody userDetailRequestModel usersDetails) {

        return null;
    }

    @DeleteMapping // eliminar usuario
    public String deleteUser() {
        return "Usuario eliminado";
    }

}
