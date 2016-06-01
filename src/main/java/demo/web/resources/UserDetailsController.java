package demo.web.resources;

import java.security.Principal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author marcos.barbero
 */
@RestController
public class UserDetailsController {

	@RequestMapping("/me")
	public Principal authenticatedUser(Principal principal) {
		return principal;
	}
}
