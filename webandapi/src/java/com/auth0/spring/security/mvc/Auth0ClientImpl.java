package com.auth0.spring.security.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Wrapper implementation around Auth0 service calls
 * Don't expose internals of Auth0 library - Spring ready
 */
@Service
public class Auth0ClientImpl extends com.auth0.Auth0ClientImpl {

    @Autowired
    public Auth0ClientImpl(final Auth0Config auth0Config) {
        super(auth0Config.getClientId(), auth0Config.getClientSecret(), auth0Config.getDomain());
    }

}
