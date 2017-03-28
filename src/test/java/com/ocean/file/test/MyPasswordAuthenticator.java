package com.ocean.file.test;

import org.apache.sshd.server.PasswordAuthenticator;
import org.apache.sshd.server.session.ServerSession;

/**
 * Very basic PasswordAuthenticator used for unit tests.
 */
public class MyPasswordAuthenticator implements PasswordAuthenticator {

	public boolean authenticate(String username, String password, ServerSession session) {
		boolean retour = false;

		if ("zby".equals(username) && "123zby".equals(password)) {
			retour = true;
		}

		return retour;
	}
}