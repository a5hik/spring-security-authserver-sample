package demo.web.resources;

import java.security.Principal;

import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author marcos.barbero
 */
@Slf4j
@RestController
public class UserDetailsController {

	@RequestMapping("/me")
	public Principal authenticatedUser(Principal principal) {
		return principal;
	}

	@RequestMapping("/authcode")
	public void code(@RequestParam String code) {
		log.info("The received code was {}", code);
	}
}
