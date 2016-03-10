package demo.web.resources;

import java.security.Principal;
import java.util.Arrays;
import java.util.Collection;

import org.springframework.security.access.prepost.PreAuthorize;
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

	@RequestMapping("/private")
	@PreAuthorize("hasRole('ROLE_CLIENT')")
	public Collection<String> restrictAccess() {
		return Arrays.asList("Hi,everybody,!!".split(","));
	}
}
