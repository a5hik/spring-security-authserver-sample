package demo.controller;

import java.security.Principal;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserDetailsController {

	@RequestMapping("/me")
	public Principal authenticatedUser(final Principal principal) {
		return principal;
	}

	@RequestMapping("/private")
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public String privateMethod() {
		return "Hello Oauth World!";
	}

}
