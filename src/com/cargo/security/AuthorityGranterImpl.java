package com.cargo.security;

import java.security.Principal;
import java.util.HashSet;
import java.util.Set;

import org.springframework.security.authentication.jaas.AuthorityGranter;

public class AuthorityGranterImpl  implements AuthorityGranter {
	public Set grant(Principal principal) {
		Set rtnSet = new HashSet();

		if (principal.getName().equals("TEST_PRINCIPAL")) {
			rtnSet.add("ROLE_USER");
//			rtnSet.add("ROLE_ADMIN");
		}

		return rtnSet;
	}
}
