package it.sevenbits.courses.quizzes.web.controller.users;

import it.sevenbits.courses.quizzes.web.controller.security.AuthRoleRequired;
import it.sevenbits.courses.quizzes.web.controller.security.UserCredentials;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * Controller to display the current user.
 */
@Controller
@RequestMapping("/whoami")
public class WhoamiController {
    /**
     * info user
     * @param userCredentials - parse token
     * @return info user
     */
    @CrossOrigin("http://localhost:3000")
    @GetMapping
    @ResponseBody
    @AuthRoleRequired("USER")
    public ResponseEntity<UserCredentials> get(
           final UserCredentials userCredentials
    ) {
        return ResponseEntity.ok(userCredentials);
    }

}

