package spring.oauth.authorization_server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import spring.oauth.authorization_server.domain.dto.UserDto;
import spring.oauth.authorization_server.service.UserService;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/create")
    public String createPage(Model model) {
        model.addAttribute("userDto", new UserDto());
        return "createPage";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute("userDto") UserDto dto, Model model) {
        userService.create(dto);
        String responseMessage = "회원가입 성공!";
        model.addAttribute("responseMessage", responseMessage);
        return "createPage";
    }

}
